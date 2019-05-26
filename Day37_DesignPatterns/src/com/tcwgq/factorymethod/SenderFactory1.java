package com.tcwgq.factorymethod;

/**
 * 多个工厂方法模式
 */
public class SenderFactory1 {
	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceMsg() {
		return new MsgSender();
	}
}
