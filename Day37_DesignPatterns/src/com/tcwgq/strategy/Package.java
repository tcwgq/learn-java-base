package com.tcwgq.strategy;

public class Package {
	private Strategy strategy;

	public Package(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void operate() {
		this.strategy.operate();
	}

}
