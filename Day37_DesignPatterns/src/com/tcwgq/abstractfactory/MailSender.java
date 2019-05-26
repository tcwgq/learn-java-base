package com.tcwgq.abstractfactory;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is MailSender");
	}

}
