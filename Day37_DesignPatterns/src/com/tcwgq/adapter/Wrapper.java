package com.tcwgq.adapter;

/**
 * 对象的适配器模式
 */
public class Wrapper implements Targetable {
	private Source source;

	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		this.source.method1();
	}

	@Override
	public void method2() {
		System.out.println("This is Targetable method2");
	}

}
