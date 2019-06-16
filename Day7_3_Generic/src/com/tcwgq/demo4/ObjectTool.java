package com.tcwgq.demo4;

//public class ObjectTool<T> {
////	//方法重载
////	public void show(String s){
////		System.out.println(s);
////	}
////	public void show(Integer i){
////		System.out.println(i);
////	}
////	public void show(boolean b){
////		System.out.println(b);
////	}
//	public void show(T t){
//		System.out.println(t);
//	}
//
//}

public class ObjectTool{
	/**
	 * 泛型方法的语法格式：
	 * public <泛型类型> 返回类型 方法名(泛型类型 )
	 * 其中参数类型1~n必须为引用类型。
	 * @param t
	 */
	public <T> void show(T t){
		System.out.println(t);
	}
}