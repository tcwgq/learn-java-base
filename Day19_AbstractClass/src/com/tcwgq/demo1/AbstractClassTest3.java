package com.tcwgq.demo1;

/**
 * 假如我们在开发一个系统时需要对员工类进行设计，员工包含3个属性：姓名、工号以及工资。 
 * 经理也是员工，除了含有员工的属性外，另为还有一个奖金属性。
 * 请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。
 */
public class AbstractClassTest3 {
	public static void main(String[] args) {
		Employee e = new CommonEmployee("employee", "112113", 8000);
		System.out.println(e.getEmpno() + "--" + e.getName() + "--" + e.getSalary());
		e.work();
		System.out.println("-----------------");
		e = new Manager("manage", "111111", 20000, 50000);
		Manager m = (Manager) e;
		System.out.println(m.getEmpno() + "--" + m.getName() + "--" + m.getSalary() + "--" + m.getBonus());
		m.work();
	}
}

abstract class Employee {
	private String name;
	private String empno;
	private int salary;

	public Employee() {
		super();
	}

	public Employee(String name, String empno, int salary) {
		super();
		this.name = name;
		this.empno = empno;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public abstract void work();
}

class CommonEmployee extends Employee {

	public CommonEmployee() {
		super();
	}

	public CommonEmployee(String name, String empno, int salary) {
		super(name, empno, salary);
	}

	@Override
	public void work() {
		System.out.println("敲代码敲到死");
	}

}

class Manager extends Employee {
	private int bonus;

	public Manager() {
		super();
	}

	public Manager(String name, String empno, int salary, int bonus) {
		super(name, empno, salary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("谈客户，拉项目");
	}

}
