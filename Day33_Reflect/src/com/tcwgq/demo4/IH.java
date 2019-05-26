package com.tcwgq.demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class IH implements InvocationHandler {
	private Object obj = null;

	public IH() {
		super();
	}

	public IH(Object obj) {
		super();
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Before");
		Object result = method.invoke(obj, args);
		System.out.println("After");
		return result;
	}

}
