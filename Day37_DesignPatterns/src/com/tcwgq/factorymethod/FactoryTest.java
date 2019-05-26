package com.tcwgq.factorymethod;

public class FactoryTest {
	public static void main(String[] args) {
		// 普通工厂方法模式
		SenderFactory sf = new SenderFactory();
		Sender sender = sf.produce("Mail");
		sender.send();
		System.out.println("----------------");
		// 多个工厂方法模式
		SenderFactory1 sf1 = new SenderFactory1();
		Sender sender1 = sf1.produceMsg();
		sender1.send();
		System.out.println("----------------");
		// 静态工厂方法模式
		Sender sender2 = SenderFactory2.produceMail();
		sender2.send();
	}
}
