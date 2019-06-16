package com.tcwgq.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 * 
 * @author lenovo
 *
 */
public abstract class Subject {
	private List<Observer> list = new ArrayList<Observer>();

	public void attach(Observer observer) {
		this.list.add(observer);
		System.out.println("Attached an observer");
	}

	public void detach(Observer observer) {
		list.remove(observer);
	}

	public void notifyObservers(String newState) {
		for (Observer observer : this.list) {
			observer.update(newState);
		}
	}
}
