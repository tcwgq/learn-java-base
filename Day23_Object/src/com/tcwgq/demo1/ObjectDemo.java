package com.tcwgq.demo1;

/**
 * public String toString(): 返回该对象的字符串表示。通常，toString
 * 方法会返回一个“以文本方式表示”此对象的字符串。结果应是一个简明但易于读懂的信息表达式。 建议所有子类都重写此方法。 Object 类的 toString
 * 方法返回一个字符串，该字符串由类名、at标记符“@”和此对象哈希码的无符号十六进制表示组成。
 * 
 * 怎么重写呢？就是把对象的相关属性值输出即可
 * 重写的最终方案为自动生成
 * 
 * 换句话说，该方法返回一个字符串，它的值等于： getClass().getName() + '@' + Integer.toHexString(hashCode())
 * 注意：
 * 直接输出一个对象的名称，其实就是调用该对象的toString方法
 */
public class ObjectDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		System.out.println(s.toString());// 没重写toString方法，com.tcwgq.demo1.Student@2a139a55
//		System.out.println(s.getClass().getName() + '@' + Integer.toHexString(s.hashCode()));
		//直接打印对象s
		System.out.println(s);
	}
}
