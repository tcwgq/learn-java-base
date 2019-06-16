package com.tcwgq.proxy;

/**
 * 底层功能仍有原始类实现，代理类只不过是添加了新功能
 */
public class Proxy implements Sourceable {
	private Source source;

	public Proxy() {
		super();
		this.source = new Source();
	}

	@Override
	public void method() {
		before();
		this.source.method();
		after();
	}

	private void before() {
		System.out.println("before proxy");
	}

	private void after() {
		System.out.println("after proxy");
	}

}
