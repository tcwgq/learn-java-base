package com.tcwgq.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompositeFlyWeightFactory {
	private Map<Character, FlyWeight> pool = new HashMap<Character, FlyWeight>();

	public FlyWeight getInstance(List<Character> compositeState) {
		ConcreteCompositeFlyWeight concreteFly = new ConcreteCompositeFlyWeight();
		for (Character state : compositeState) {
			concreteFly.add(state, this.getInstance(state));
		}
		return concreteFly;
	}

	public FlyWeight getInstance(Character state) {
		FlyWeight flyweight = pool.get(state);
		if (flyweight == null) {
			flyweight = new ConcreteFlyWeight(state);
			pool.put(state, flyweight);
		}
		return flyweight;
	}
}
