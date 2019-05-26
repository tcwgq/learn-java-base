package com.tcwgq.demo1;

/**
 * 我们一直在使用构造方法，但是，我们确没有定义构造方法，用的是哪里来的呢?
 * 
 * 构造方法的注意事项: 
 * A:如果我们没有给出构造方法，系统将自动提供一个无参构造方法。
 * B:如果我们给出了构造方法，系统将不再提供默认的无参构造方法。
 * 		注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出。
 * 		建议永远自己给出无参构造方法
 * 		不管我们给出了无参的构造方法还是带参的构造方法，系统都将不再给出无参的构造方法
 * 
 * 给成员变量赋值有两种方式： 
 * A:setXxx() B:构造方法
 */
public class ConstructorDemo {
	public static void main(String[] args) {
		Student s = new Student();// The constructor Student() is undefined
		System.out.println(s);
		Student s1 = new Student("aaa");
		System.out.println(s1);
		Student s2 = new Student(30);
		System.out.println(s2);
		Student s3 = new Student("aaa", 25);
		System.out.println(s3);

	}
}

class Student {
	private String name;
	private int age;

	public Student() {
		System.out.println("无参构造方法");
	}

	public Student(String name) {
		System.out.println("这是带name的构造方法");
		this.name = name;
	}

	public Student(int age) {
		System.out.println("这是带age的构造方法");
		this.age = age;
	}

	public Student(String name, int age) {
		System.out.println("这是带多个参数的构造方法");
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

}