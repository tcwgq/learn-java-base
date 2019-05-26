package com.tcwgq.flyweight;

/**
 * 虽然用户申请了3个享元对象，但实际上创建的享元对象只有2个，这就是共享的含义。
 */
public class FlyWeightTest {
	public static void main(String[] args) {
		FlyWeightFactory factory = new FlyWeightFactory();
		FlyWeight f = factory.getInstance('A');
		f.function("First Call");
		f = factory.getInstance('B');
		f.function("Second Call");
		f = factory.getInstance('A');
		f.function("Third Call");
	}
}
