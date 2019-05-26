package com.tcwgq.abstractfactory;

public class MsgSenderFactory implements Provider {

	@Override
	public Sender produce() {
		return new MsgSender();
	}

}
