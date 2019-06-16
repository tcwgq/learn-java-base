package com.tcwgq.demo1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test {
	public static void main(String[] args) {
		Phone p = new IPhone();
		p.call();
		System.out.println("-----------------");
		Decorate d = new MusicDecorate(p);
		d.call();
		System.out.println("------------------");
		d = new RingDecorate(p);
		d.call();
		System.out.println("---------------------");
		d = new RingDecorate(new MusicDecorate(p));
		d.call();
		System.out.println("--------------------");
		// 回想IO流中的装饰
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	}
}
