package com.tcwgq.jdbc.dao;

import java.util.Date;
import com.tcwgq.jdbc.domain.User;

public class UserDaoTest {
	public static void main(String[] args) {
		// UserDao ud = new UserDaoJdbcImpl();
		UserDao ud = DaoFactory.getInstance().getUserDao();
		User user = new User();
		user.setName("liSi");
		user.setBirthday(new Date());
		user.setMoney(1121.45f);
		ud.addUser(user);
		int id = user.getId();
		System.out.println(id);
		System.out.println("--------------");
		user = ud.getUser(1);
		System.out.println(user);
		System.out.println("---------------");
		user = ud.findUser("zhangSan", null);
		System.out.println(user);
		System.out.println("---------------");
		user.setMoney(1024.78f);
		ud.update(user);
		System.out.println("---------------");
		User u = new User(19, "aaa", new Date(), 12.34f);
		ud.delete(u);
	}
}
