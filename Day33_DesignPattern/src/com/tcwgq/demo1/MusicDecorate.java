package com.tcwgq.demo1;

public class MusicDecorate extends Decorate {

	public MusicDecorate() {
		super();
	}

	public MusicDecorate(Phone p) {
		super(p);
	}

	@Override
	public void call() {
		super.call();
		System.out.println("Music");
	}
}
