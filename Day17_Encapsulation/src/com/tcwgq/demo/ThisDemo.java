package com.tcwgq.demo;

/**
 * this:代表所在类的对象引用
 */
class ThisDemo {
	public static void main(String[] args) {
		Student2 s = new Student2();
		s.setName("林青霞");
		s.setAge(27);
		System.out.println(s.getName() + "--" + s.getAge());
	}
}

class Student2 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// name = name;//The assignment to variable name has no effect
		/*
		 * 按照变量的作用范围的就近原则，这个两个那么始终是方法参数上的name， 与成员变量没有关系，因此是name本身赋给name
		 */
		// Student2.name = name;//Cannot make a static reference to the
		// non-static field Student2.name
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// age = age;//The assignment to variable name has no effect
		this.age = age;
	}
}
