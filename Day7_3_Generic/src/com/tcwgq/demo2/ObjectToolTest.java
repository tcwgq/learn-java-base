package com.tcwgq.demo2;

import org.junit.Test;

public class ObjectToolTest {
	@Test
	public void fun(){
		ObjectTool ot = new ObjectTool();
		ot.setObj("hello");
		String s = (String)ot.getObj();
		System.out.println(s);
		ot.setObj(new Integer(100));
		Integer i = (Integer)ot.getObj();
		System.out.println(i);
		ot.setObj(new Integer(10));
		String ss = (String)ot.getObj();
		//ClassCastException
		System.out.println(ss);
	}

}
