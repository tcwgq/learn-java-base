package com.tcwgq.flyweight;

public class ConcreteFlyWeight implements FlyWeight {
	private Character intrinsicState = null;

	public ConcreteFlyWeight(Character state) {
		super();
		this.intrinsicState = state;
	}

	@Override
	public void function(String state) {
		System.out.println("intrinsicState is " + this.intrinsicState);
		System.out.println("extrinsicState is " + state);
	}

}
