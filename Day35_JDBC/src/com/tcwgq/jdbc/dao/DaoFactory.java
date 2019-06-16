package com.tcwgq.jdbc.dao;

import java.io.InputStream;
import java.util.Properties;

public class DaoFactory {
	private static UserDao userDao = null;// 本段代码必须放在构造方法的前面
	private static DaoFactory instance = new DaoFactory();

	private DaoFactory() {
		try {
			// Reader reader = new BufferedReader(new
			// FileReader("src/daoconfig.properties"));
			InputStream is = DaoFactory.class.getClassLoader().getResourceAsStream("daoconfig.properties");
			Properties prop = new Properties();
			prop.load(is);
			String className = prop.getProperty("className");
			Class<?> c = Class.forName(className);
			userDao = (UserDao) c.newInstance();
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static DaoFactory getInstance() {
		return instance;
	}

	public UserDao getUserDao() {
		return userDao;
	}
}
