package com.tcwgq.demo;

/**
 * encapsulation:封装
 * private:私有的。可以修饰成员变量和成员方法。 
 * 注意：被private修饰的成员只能在本类中访问。
 * 封装：是指隐藏对象的属性和实现细节，仅对外提供公共访问方式。
 */
class EncapsulationDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		System.out.println("----------");
		s.name = "林青霞";
//		s.age = 27;//The field Student.age is not visible
		s.show();
//		s.age = -27;//The field Student.age is not visible
		s.show();
		s.setAge(-25);
		s.show();
		s.setAge(27);
		s.show();
	}
}

class Student {
	String name;
	private int age;

	public void setName(String sname) {
		name = sname;
	}

	public void setAge(int sage) {
		if (sage < 0 || sage > 120) {
			System.out.println("数据非法");
		} else {
			age = sage;
		}
	}

	public void show() {
		System.out.println("名字：" + name);
		System.out.println("年龄：" + age);
	}
}
