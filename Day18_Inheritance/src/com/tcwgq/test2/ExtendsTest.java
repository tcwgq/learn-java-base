package com.tcwgq.test2;

/**
 * 看程序写结果 
 * 我的结果：YXYZ 
 * 正确结果：YXYZ
 */
class Y {
	Y() {
		System.out.print("Y");
	}
}

class X {
	Y b = new Y();

	X() {
		System.out.print("X");
	}
}

class Z extends X {
	Y y = new Y();

	Z() {
		// super();
		/*
		 * 如果super()执行的话，结果应该是YXYYXZ，但这种理解是错误的 虽然子类中构造方法默认有一个super()
		 * 初始化的时候，不是按照那个顺序进行的。 而是按照分层初始化进行的。 它仅仅表示要先初始化父类数据，再初始化子类数据。
		 */
		System.out.print("Z");
	}

	public static void main(String[] args) {
		new Z();
	}
}