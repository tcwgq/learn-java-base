package com.tcwgq.demo2;

/**
 * 三种循环语句其实都可以完成一样的功能，也就是说可以等价转换，但还是有小区别的: do…while循环至少会执行一次循环体。
 * for循环和while循环只有在条件成立的时候才会去执行循环体 注意事项： 写程序优先考虑for循环，再考虑while循环，最后考虑do…while循环。
 * 如下代码是死循环 while(true){} for(;;){}
 */
public class DoWhileDemo1 {
	public static void main(String[] args) {
//		while(true){
//			//这是死循环
//		}
		for(;;){
			//这是死循环
		}
	}

}
