package com.tcwgq.observer;

public class ConcreteObserver implements Observer {
	private String observerState;

	@Override
	public void update(String state) {
		this.observerState = state;
		System.out.println("观察者状态为：" + observerState);
	}
}
