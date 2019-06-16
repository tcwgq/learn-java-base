package com.tcwgq.demo5;

/**
 * 定义一个员工类,自己分析出几个成员，
 * 然后给出成员变量，构造方法，getXxx()/setXxx()方法，
 * 以及一个显示所有成员信息的方法。并测试。
 */
public class OOTest2 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.show();
		e.setAge(30);
		e.setEmpno("112113");
		e.setEname("aaa");
		e.show();
		Employee e1 = new Employee("123456", "bbb", 45);
		e1.show();
	}
}

class Employee {
	private String empno;
	private String ename;
	private int age;
	public Employee(){
		
	}
	public Employee(String empno, String ename, int age){
		this.empno = empno;
		this.ename = ename;
		this.age = age;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show(){
		System.out.println(empno + "--" + ename + "--" + age);
	}
}