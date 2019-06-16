package com.tcwgq.bridge;

public class BridgeTest {
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		Sourceable source1 = new SourceableImpl1();
		bridge.setSource(source1);
		bridge.method();
		System.out.println("------------");
		Sourceable source2 = new SourceableImpl2();
		bridge.setSource(source2);
		bridge.method();
	}
}
