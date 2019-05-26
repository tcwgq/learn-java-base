package com.tcwgq.demo3;

public class ObjectTool<T> {
	/**
	 * 泛型类的语法格式：
	 * public class className<参数类型1,参数类型2...参数类型n>,
	 * 其中参数类型1~n必须为引用类型。
	 * 注意，泛型类在定义时，尖括号内的类型参数遵从Java的变量命名规则，此处只是一个符号，
	 * 真正使用时，尖括号里必须是引用类型。
	 */
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	

}
