package com.tcwgq.demo5;

/**
 * 定义一个长方形类,定义 求周长和面积的方法，然后定义一个测试了Test2，进行测试。 
 * 注意： import必须出现在所有的class前面。
 */
public class OOTest1 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 20);
		System.out.println(r.perimeter());
		System.out.println(r.area());
	}
}

class Rectangle {
	private int length;
	private int width;

	public Rectangle() {

	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int perimeter() {
		return 2 * length * width;
	}

	public int area() {
		return length * width;
	}
}