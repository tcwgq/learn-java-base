package com.tcwgq.demo;

/**
 * 多线程概述 进程:正在运行的程序，是系统进行资源分配和调用的独立单位。 
 * 每一个进程都有它自己的内存空间和系统资源。 
 * 线程:是进程中的单个顺序控制流，是一条执行路径 
 * 一个进程如果只有一条执行路径，则称为单线程程序。 
 * 一个进程如果有多条执行路径，则称为多线程程序。
 * 
 * 并行与并发：
 * 并行是指两个或者多个事件在同一时刻发生；
 * 并发是指两个或多个事件在同一时间间隔内发生。
 * 
 * 思考题：
 * jvm虚拟机的启动是单线程的还是多线程的？
 * 多线程的，原因是垃圾回收线程也要运行，否则会出现内存溢出。
 * 这样来看的话，JVM的启动，至少要需要两个线程。
 */
public class ThreadDemo {
	public static void main(String[] args) {

	}
}
