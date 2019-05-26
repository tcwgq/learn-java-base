package com.tcwgq.demo3;

/**
 * protected void finalize(): 当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。
 * 子类重写finalize方法，以配置系统资源或执行其他清除。简单讲就是用于垃圾回收，但回收垃圾的时间不确定。
 * 
 * protected Object clone():创建并返回此对象的一个副本。
 * CloneNotSupportedException:当调用 Object 类中的 clone 方法复制对象，但该对象的类无法实现 Cloneable接口时，抛出该异常。
 * 
 * Cloneable:此类实现了 Cloneable 接口，以指示 Object.clone()方法可以合法地对该类实例进行按字段复制。
 * 此接口中没有方法，像这样的接口叫做标记接口。 
 */
public class ObjectDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student("aaa", 25);
		Student clone = (Student)s.clone();
		System.out.println(s.getName() + "--" + s.getAge());//aaa--25
		System.out.println(clone.getName() + "--" + clone.getAge());//aaa--25
		System.out.println(s == clone);//false
		System.out.println(s.getClass() == clone.getClass());//true
		System.out.println(s.equals(s.clone()));//false
		//请看下面的区别
		Student ss = s;
		System.out.println(ss.getName() + "--" + ss.getAge());//aaa--25
		ss.setName("bbb");
		ss.setAge(30);
		System.out.println(s.getName() + "--" + s.getAge());//bbb--30
		System.out.println(ss.getName() + "--" + ss.getAge());//bbb--30
		System.out.println(clone.getName() + "--" + clone.getAge());//aaa--25
	}
}
