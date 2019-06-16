package com.tcwgq.jdbc.domain;

import java.util.Date;

public class User {
	private int id;
	private String name;
	private Date birthday;
	private float money;

	public User() {
		super();
	}

	public User(int id, String name, Date birthday, float money) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.money = money;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthday=" + birthday + ", money=" + money + "]";
	}

}
