package com.tcwgq.demo;
/**
 * 赋值运算符的面试题：
 * short s=1, s = s+1; short s=1, s+=1;
 *上面两个代码有没有问题，如果有，那里有问题
 */
public class OperatorDemo4 {
	public static void main(String[] args) {
		short s1 = 1;
//		s1 = s1 + 1;//先转换为int类型，再做运算，结果为int类型，赋给s1，损失精度
		System.out.println(s1);
		short s2 = 1;
		s2 += 1;//好像是 s = s +1，其实不是
		System.out.println(s2);
		//扩展的赋值运算符隐含了强制类型转换
		//s += 1 不是等于s = s +1，而是等于s = (short)(s + 1)
	}

}
