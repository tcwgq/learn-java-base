package com.tcwgq.demo4;

import org.junit.Test;

public class ObjectToolTest {
//	public static void main(String[] args) {
//		ObjectTool<String> ot = new ObjectTool<String>();
//		ot.show("hello");
//		ObjectTool<Integer> ot1 = new ObjectTool<Integer>();
//		ot1.show(100);
//		ObjectTool<Boolean> ot2 = new ObjectTool<Boolean>();
//		ot2.show(true);
//	}
	@Test
	public void fun(){
		ObjectTool ot = new ObjectTool();
		ot.show("hello");
		ot.show(100);
		ot.show(true);
	}
}
