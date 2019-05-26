package com.tcwgq.strategy;

/**
 * 求吴国太开个绿灯。
 */
public class GreenLight implements Strategy {

	@Override
	public void operate() {
		System.out.println("求吴国太开个绿灯，放行！");
	}

}
