package com.tcwgq.demo3;

public class UserDaoImpl1 implements UserDao {

	@Override
	public void add() {
		System.out.println("Check");
		System.out.println("Add");
		System.out.println("Log");
	}

	@Override
	public void delete() {
		System.out.println("Check");
		System.out.println("Delete");
		System.out.println("Log");
	}

	@Override
	public void update() {
		System.out.println("Check");
		System.out.println("Update");
		System.out.println("Log");
	}

	@Override
	public void query() {
		System.out.println("Check");
		System.out.println("Query");
		System.out.println("Log");
	}

}
