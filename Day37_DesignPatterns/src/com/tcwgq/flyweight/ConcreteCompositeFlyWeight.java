package com.tcwgq.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ConcreteCompositeFlyWeight implements FlyWeight {
	private Map<Character, FlyWeight> pool = new HashMap<Character, FlyWeight>();

	public void add(Character state, FlyWeight flyweight) {
		pool.put(state, flyweight);
	}

	@Override
	public void function(String state) {
		FlyWeight fw = null;
		for (Character key : pool.keySet()) {
			fw = pool.get(key);
			fw.function(state);
		}
	}

}
