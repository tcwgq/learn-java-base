package com.tcwgq.demo1;

public class RingDecorate extends Decorate {

	public RingDecorate() {
		super();
	}

	public RingDecorate(Phone p) {
		super(p);
	}

	@Override
	public void call() {
		System.out.println("Ring");
		super.call();
	}

}
