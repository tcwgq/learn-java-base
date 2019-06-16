package com.tcwgq.demo2;

public class Student {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// @Override
	// public boolean equals(Object obj) {
	// // return super.equals(obj);//相当于没重写一样
	// // 为了提高方法的效率
	// if (this == obj) {
	// return true;
	// }
	// // 为了提高方法的健壮性
	// if (!(obj instanceof Student)) {
	// return false;
	// }
	// Student s = (Student) obj;
	// System.out.println("如果是同一对象，还需要比较么？");
	// if (this.name.equals(s.name) && this.age == s.age) {
	// return true;
	// } else {
	// return false;
	// }
	// }

}
