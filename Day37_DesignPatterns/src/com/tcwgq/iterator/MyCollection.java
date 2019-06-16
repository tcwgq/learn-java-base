package com.tcwgq.iterator;

public class MyCollection implements Collection {
	private String[] list = { "a", "b", "c", "d", "e", "f", "g" };

	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return list[i];
	}

	@Override
	public int size() {
		return list.length;
	}

}
