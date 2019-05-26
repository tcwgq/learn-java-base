package com.tcwgq.abstractfactory;

/**
 * 抽象工厂模式
 */
public class FactoryTest {
	public static void main(String[] args) {
		Provider provider = new MailSenderFactory();
		Sender sender = provider.produce();
		sender.send();
	}
}
