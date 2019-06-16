package com.tcwgq.demo4;

public class Student implements Comparable<Student> {
	private String name;
	private int age;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
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

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		// return 0;
		// return 1;
		// return -1;
		// 单纯的返回一个整数无意义，需要根据比较的属性值返回
		// return this.age - o.age;
		// 上面的这种情况，当年龄相同时，而名字不同时，元素添加不进去
		int a = this.age - o.getAge();
		int b = a == 0 ? this.name.compareTo(o.getName()) : a;
		return b;
	}

}
