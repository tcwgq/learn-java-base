package com.tcwgq.demo3;

import org.junit.Test;

public class ObjectToolTest {
	@Test
	public void fun(){
		ObjectTool<String> ot = new ObjectTool<String>();
		ot.setObj("hello");
//		ot.setObj(new Integer(100));//使用泛型，此处类型错误。
		String s = ot.getObj();
		System.out.println(s);
	}

}
