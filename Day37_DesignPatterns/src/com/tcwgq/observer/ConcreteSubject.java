package com.tcwgq.observer;

public class ConcreteSubject extends Subject {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void change(String newState) {
		this.state = newState;
		System.out.println("主题状态为：" + newState);
		this.notifyObservers(state);
	}
}
