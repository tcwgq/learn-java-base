package com.tcwgq.demo1;

public class Test2 {
	public static void main(String[] args) {
		Direction d1 = Direction.FRONT;
		Direction d2 = Direction.BEHIND;
		Direction d3 = Direction.LEFT;
		Direction d4 = Direction.RIGHT;
		// public final int compareTo(E o)
		System.out.println(d1.compareTo(d1));
		System.out.println(d1.compareTo(d2));
		System.out.println(d1.compareTo(d3));
		System.out.println(d4.compareTo(d1));
		System.out.println("----------------");
		// public final String name()
		System.out.println(d1.name());
		System.out.println(d2.name());
		System.out.println(d3.name());
		System.out.println(d4.name());
		System.out.println("-----------------");
		// public final int ordinal()
		System.out.println(d1.ordinal());
		System.out.println(d2.ordinal());
		System.out.println(d3.ordinal());
		System.out.println(d4.ordinal());
		System.out.println("------------------");
		// public String toString()
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		System.out.println(d4.toString());
		System.out.println("-------------------");
		// public static <T extends Enum<T>> T valueOf(Class<T> enumType,String name)
		Direction d5 = Enum.valueOf(Direction.class, "FRONT");
		System.out.println(d5);
		System.out.println("--------------------");
		// values()
		// 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
		Direction[] dirs = Direction.values();
		for (Direction dir : dirs) {
			System.out.println(dir);
		}
	}
}
