package com.tcwgq.adapter;

/**
 * 类的适配器模式
 */
public class Adapter extends Source implements Targetable {
	@Override
	public void method1() {
		super.method1();
	}

	@Override
	public void method2() {
		System.out.println("This is Targetable method2");
	}

}
