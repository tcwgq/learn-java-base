package com.tcwgq.jdbc.datasource;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;

public class MyConnectionHandler implements InvocationHandler {
	private Connection realConnection;
	private Connection wrappedConnection;
	private MyDataSource2 dataSource;
	private int maxUseCount = 5;// 最大使用次数
	private int currentUseCount = 0;// 当前使用次数

	public MyConnectionHandler(MyDataSource2 dataSource) {
		this.dataSource = dataSource;
	}

	public Connection bind(Connection realConnection) {
		this.realConnection = realConnection;
		this.wrappedConnection = (Connection) Proxy.newProxyInstance(this.getClass().getClassLoader(),
				new Class[] { Connection.class }, this);
		return wrappedConnection;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if ("close".equals(method.getName())) {
			this.currentUseCount++;// 当前使用次数加1
			if (this.currentUseCount < this.maxUseCount) {
				this.dataSource.connectionsPool.addLast(this.wrappedConnection);// 放回缓冲池的是MyConnection
			} else {
				this.realConnection.close();// 连接真正关闭
				this.dataSource.currentCount--;// 缓冲池中的连接数减1
			}
		}
		return method.invoke(this.realConnection, args);
	}

}
