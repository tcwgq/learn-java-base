package com.tcwgq.factorymethod;

/**
 * 静态工厂模式
 */
public class SenderFactory2 {
	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceMsg() {
		return new MsgSender();
	}
}
