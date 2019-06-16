package com.tcwgq.demo3;

public class UserDaoImpl implements UserDao {

	@Override
	public void add() {
		System.out.println("Add");
	}

	@Override
	public void delete() {
		System.out.println("Delete");
	}

	@Override
	public void update() {
		System.out.println("Update");
	}

	@Override
	public void query() {
		System.out.println("Query");
	}

}
