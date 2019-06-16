package com.tcwgq.facade;

public class FacadeTest {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startUp();
		System.out.println("-------------");
		computer.shutDown();
	}
}
