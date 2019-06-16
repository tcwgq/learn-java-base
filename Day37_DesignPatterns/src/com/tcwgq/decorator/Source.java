package com.tcwgq.decorator;

/**
 * 这是没被装饰之前的类
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("This is the original method");
	}

}
