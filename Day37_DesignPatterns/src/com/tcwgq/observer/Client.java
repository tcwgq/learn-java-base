package com.tcwgq.observer;

public class Client {
	public static void main(String[] arsg) {
		ConcreteSubject subject = new ConcreteSubject();
		Observer observer = new ConcreteObserver();
		subject.attach(observer);
		subject.change("new state");
	}
}
