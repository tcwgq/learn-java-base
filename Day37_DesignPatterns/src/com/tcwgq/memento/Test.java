package com.tcwgq.memento;

public class Test {
	public static void main(String[] args) {
		Original origin = new Original("old");
		Memento memento = origin.createMemento();
		Storage storage = new Storage(memento);
		System.out.println("初始化状态为：" + origin.getValue());
		origin.setValue("new");
		System.out.println("修改后的状态为：" + origin.getValue());
		origin.restoreMemento(storage.getMemento());
		System.out.println("恢复后的状态为：" + origin.getValue());
	}
}
