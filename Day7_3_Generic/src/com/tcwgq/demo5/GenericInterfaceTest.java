package com.tcwgq.demo5;

import org.junit.Test;

public class GenericInterfaceTest {
	@Test
	public void fun(){
//		GenericInterface<String> gi = new GenericInterfaceImpl();//多态
		GenericInterfaceImpl gii = new GenericInterfaceImpl();
		gii.show("hello");
//		gii.show(100);//类型错误
	}
	
	@Test
	public void fun1(){
		GenericInterfaceImpl1<String> gii = new GenericInterfaceImpl1<String>();
		gii.show("hello");
		GenericInterfaceImpl1<Integer> gii2 = new GenericInterfaceImpl1<Integer>();
		gii2.show(100);
	}

}
