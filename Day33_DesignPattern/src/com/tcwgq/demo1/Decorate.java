package com.tcwgq.demo1;

public abstract class Decorate implements Phone {
	private Phone p;

	public Decorate() {
		super();
	}

	public Decorate(Phone p) {
		super();
		this.p = p;
	}

	@Override
	public void call() {
		this.p.call();
	}

}
