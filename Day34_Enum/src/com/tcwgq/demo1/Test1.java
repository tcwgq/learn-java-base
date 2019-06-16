package com.tcwgq.demo1;

public class Test1 {
	public static void main(String[] args) {
		Direction d = Direction.FRONT;
		switch (d) {
		case FRONT:
			System.out.println("Front");
			break;
		case BEHIND:
			System.out.println("Behind");
			break;
		case LEFT:
			System.out.println("Left");
			break;
		case RIGHT:
			System.out.println("Right");
			break;
		default:
			System.out.println("Error");
			break;
		}
	}
}
