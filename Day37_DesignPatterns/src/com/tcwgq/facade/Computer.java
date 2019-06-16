package com.tcwgq.facade;

public class Computer {
	private CPU cpu;
	private Memory memory;
	private Disk disk;

	public Computer() {
		super();
		this.cpu = new CPU();
		this.memory = new Memory();
		this.disk = new Disk();
	}

	public void startUp() {
		System.out.println("start the computer");
		this.cpu.startUp();
		this.memory.startUp();
		this.disk.startUp();
		System.out.println("start the computer finished");
	}

	public void shutDown() {
		System.out.println("shut the computer");
		this.cpu.shutDown();
		this.memory.shutDown();
		this.disk.shutDown();
		System.out.println("shut the computer finished");
	}

}
