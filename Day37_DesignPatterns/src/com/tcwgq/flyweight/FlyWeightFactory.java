package com.tcwgq.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	private Map<Character, FlyWeight> pool = new HashMap<Character, FlyWeight>();

	public FlyWeight getInstance(Character state) {
		FlyWeight flyweight = pool.get(state);
		if (flyweight == null) {
			flyweight = new ConcreteFlyWeight(state);
			pool.put(state, flyweight);
		}
		return flyweight;
	}
}