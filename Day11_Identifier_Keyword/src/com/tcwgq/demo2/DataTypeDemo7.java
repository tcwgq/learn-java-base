package com.tcwgq.demo2;
/*
 数据类型应该注意的几个小问题：
  1:在定义Long或者Float类型变量的时候，要加L或者f。
  	整数默认是int类型，浮点数默认是double。
  	byte，short在定义的时候，他们接收的其实是一个int类型的值。
  	这个是自己做了一个数据检测的，如果不在它们的范围内，就报错。
  
2:byte值的问题
	byte b1 = 127;
	byte b2 = (byte)128; //-128
	byte b3 = (byte)129; //-127
	byte b4 = (byte)130; //-126
	
	byte的范围：-128 ~ 127
	
	128：10000000
	-128：10000000 (这里的1即是符号位，也是数值位)
	
3:数据类型转换之默认转换
	byte,short,char -- int -- long -- float -- double
	long: 8个字节
	float：4个字节
	A:它们底层的存储结构不同。
	B:float表示的数据范围比long的范围要大
		long：2^63-1
		float：3.4*10^38 > 2*10^38 > 2*8^38 = 2*2^3^38 = 2*2^114 > 2^63-1

4:Java语言中的字符char可以存储一个中文汉字吗?为什么呢?
	可以。因为java语言中的字符占用两个字节。
	Java语言采用的是Unicode编码。
 */
public class DataTypeDemo7 {
	public static void main(String[] args) {
		byte b1 = 127;
		byte b2 = (byte)128; //-128
		byte b3 = (byte)129; //-127
		byte b4 = (byte)130; //-126
		byte b5 = (byte)131;
		System.out.println(b1);//127
		System.out.println(b2);//-128
		System.out.println(b3);//-127
		System.out.println(b4);//-126
		System.out.println(b5);//-125
	}

}
