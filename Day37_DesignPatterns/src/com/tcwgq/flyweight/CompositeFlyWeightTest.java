package com.tcwgq.flyweight;

import java.util.ArrayList;
import java.util.List;

public class CompositeFlyWeightTest {
	public static void main(String[] args) {
		List<Character> compositeState = new ArrayList<Character>();
		compositeState.add('a');
		compositeState.add('b');
		compositeState.add('c');
		compositeState.add('a');
		compositeState.add('b');
		CompositeFlyWeightFactory factory = new CompositeFlyWeightFactory();
		FlyWeight f1 = factory.getInstance(compositeState);
		FlyWeight f2 = factory.getInstance(compositeState);
		f1.function("Composite Call");
		System.out.println("复合享元模式是否可以共享对象：" + (f1 == f2));
		System.out.println("--------------");
		Character state = 'a';
		FlyWeight fly1 = factory.getInstance(state);
		FlyWeight fly2 = factory.getInstance(state);
		System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
	}
}
