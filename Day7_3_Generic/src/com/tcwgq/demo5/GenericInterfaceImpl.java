package com.tcwgq.demo5;

public class GenericInterfaceImpl implements GenericInterface<String>{
	/**
	 * 实现类确定泛型类型
	 */
	@Override
	public void show(String t) {
		System.out.println(t);
	}

}