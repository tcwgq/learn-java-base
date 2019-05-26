package com.tcwgq.demo7;

public class MyRuntimeException extends RuntimeException {
	private static final long serialVersionUID = 8635960608043545067L;

	public MyRuntimeException() {
		super();
	}

	public MyRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MyRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyRuntimeException(String message) {
		super(message);
	}

	public MyRuntimeException(Throwable cause) {
		super(cause);
	}

}
