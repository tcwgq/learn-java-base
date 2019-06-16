package com.tcwgq.demo4;

import java.util.LinkedList;

public class MyStack<T> {
	private LinkedList<T> ll = new LinkedList<T>();

	public MyStack() {
		super();
	}
	public boolean add(T ele){
		this.ll.addFirst(ele);
		return true;
	}
	public T get(){
//		return this.ll.getFirst();//只返回第一元素
		return this.ll.removeFirst();//返回第一个元素，并移除之
	}
	public boolean isEmpty(){
		return this.ll.isEmpty();
	}

}
