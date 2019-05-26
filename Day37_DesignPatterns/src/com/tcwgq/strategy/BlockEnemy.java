package com.tcwgq.strategy;

/**
 * 孙夫人断后，挡住追兵。
 */
public class BlockEnemy implements Strategy {

	@Override
	public void operate() {
		System.out.println("孙夫人断后，挡住追兵...");
	}

}
