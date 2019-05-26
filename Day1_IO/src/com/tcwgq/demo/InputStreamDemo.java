package com.tcwgq.demo;

public class InputStreamDemo {
	/**
	 * InputStream: 此抽象类是表示字节输入流的所有类的超类。
	 */

	/**
	 * InputStream类的方法： abstract int read(): 从输入流中读取数据的下一个字节。
	 * 返回 0 到 255 范围内的 int字节值。如果因为已经到达流末尾而没有可用的字节，则返回值 -1。
	 * int read(byte[] b):从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
	 * 以整数形式返回实际读取的字节数。 
	 * int read(byte[] b, int off, int len):将输入流中最多 len 个数据字节读入 byte 数组。
	 * 尝试读取 len 个字节，但读取的字节也可能小于该值。以整数形式返回实际读取的字节数。
	 * void mark(int readlimit): 在此输入流中标记当前的位置。
	 * 对 reset 方法的后续调用会在最后标记的位置重新定位此流，
	 * 以便后续读取重新读取相同的字节。readlimit参数告知此输入流在标记位置失效之前允许读取的字节数。 
	 * void reset():将此流重新定位到最后一次对此输入流调用 mark 方法时的位置。
	 * boolean markSupported():测试此输入流是否支持 mark 和 reset 方法。
	 * 是否支持 mark 和 reset 是特定输入流实例的不变属性。
	 * long skip(long n):跳过和丢弃此输入流中数据的 n 个字节。出于各种原因，skip 方法结束时跳过的字节数可能小于该数，也可能为 0。
	 * 返回跳过的实际字节数。如果 n 为负，则不跳过任何字节。
	 * int available():返回此输入流下一个方法调用可以不受阻塞地从此输入流读取（或跳过）的估计字节数。 
	 * void close():关闭此输入流并释放与该流关联的所有系统资源。
	 */

}
