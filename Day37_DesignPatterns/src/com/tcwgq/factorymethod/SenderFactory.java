package com.tcwgq.factorymethod;

/**
 * 普通工厂模式
 */
public class SenderFactory {
	public Sender produce(String type) {
		if ("Mail".equals(type)) {
			return new MailSender();
		} else if ("Msg".equals(type)) {
			return new MsgSender();
		} else {
			System.out.println("请输入正确类型");
			return null;
		}
	}
}
