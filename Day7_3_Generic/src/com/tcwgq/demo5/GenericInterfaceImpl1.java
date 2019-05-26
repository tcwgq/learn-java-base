package com.tcwgq.demo5;

public class GenericInterfaceImpl1<T> implements GenericInterface<T>{
	/**
	 * 实现类不确定泛型类型
	 */
	@Override
	public void show(T t) {
		System.out.println(t);
	}
	
}