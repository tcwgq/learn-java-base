package com.tcwgq.demo6;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

/**
 * 泛型通配符<?>:任意类型，如果没有明确，那么就是Object以及任意的Java类了
 * ? extends E:向下限定，E及其子类
 * ? super E:向上限定，E及其父类
 * @author lenovo
 */
public class GenericDemo {
	@Test
	public void fun(){
		//注意：泛型明确写的时候，前后必须一致。
//		Collection<?> c1 = new ArrayList<?>();//这个可以理解为?代表任意类型，会导致前后两个?代表的类型不同。
		Collection<?> c2 = new ArrayList<Object>();
		Collection<?> c3 = new ArrayList<Animal>();
		Collection<?> c4 = new ArrayList<Dog>();
		Collection<?> c5 = new ArrayList<Cat>();
		//注意：泛型明确写的时候，前后必须一致。
		Collection<Object> c6 = new ArrayList<Object>();
//		Collection<Object> c7 = new ArrayList<Animal>();//错误
//		Collection<Object> c8 = new ArrayList<Dog>();//错误
//		Collection<Object> c9 = new ArrayList<Cat>();//错误
		//? extends E:向下限定，E及其子类
//		Collection<? extends Animal> c10 = new ArrayList<Object>();//? extends E:向下限定，E及其子类
		Collection<? extends Animal> c11 = new ArrayList<Animal>();
		Collection<? extends Animal> c12 = new ArrayList<Dog>();
		Collection<? extends Animal> c13 = new ArrayList<Cat>();
		//super E:向上限定，E及其父类
		Collection<? super Animal> c14 = new ArrayList<Object>();
		Collection<? super Animal> c15 = new ArrayList<Animal>();
//		Collection<? super Animal> c16 = new ArrayList<Dog>();//super E:向上限定，E及其父类
//		Collection<? super Animal> c17 = new ArrayList<Cat>();//super E:向上限定，E及其父类
		
		
	}
}

class Animal{
	
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}
