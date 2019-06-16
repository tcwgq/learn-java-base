package com.tcwgq.abstractfactory;

public class MsgSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is MsgSender");
	}

}
