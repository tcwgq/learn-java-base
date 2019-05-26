package com.tcwgq.adapter;

public class AdapterTest {
	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
		System.out.println("------------");
		Source source = new Source();
		Targetable target1 = new Wrapper(source);
		target1.method1();
		target1.method2();
		System.out.println("-------------");
		Sourceable s1 = new MyAdapter1();
		Sourceable s2 = new MyAdapter2();
		s1.show();
		s1.method();
		s1.function();
		System.out.println("-------------");
		s2.show();
		s2.method();
		s2.function();
	}
}
