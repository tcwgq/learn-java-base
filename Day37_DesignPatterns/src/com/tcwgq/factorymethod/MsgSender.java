package com.tcwgq.factorymethod;

public class MsgSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is MsgSender");
	}

}
