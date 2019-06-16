package com.tcwgq.demo1;

/**
 * 抽象类作为返回值类型，返回的是抽象类的具体子类的对象
 */
class FormalParameterDemo1 {
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();
		Person p = pd.getPerson();
		p.study();
	}
}

abstract class Person {
	public abstract void study();
}

class PersonDemo {
	public Person getPerson() {
		// return new Person();// Cannot instantiate the type Perso
		return new Teacher();
	}
}

class Teacher extends Person {

	@Override
	public void study() {
		System.out.println("Good good study, day day up !");
	}

}
