package com.tcwgq.demo1;

public enum Direction2 {
	FRONT("前") {
		@Override
		public void show() {
			System.out.println("前");
		}
	},
	BEHIND("后") {
		@Override
		public void show() {
			System.out.println("后");
		}
	},
	LEFT("左") {
		@Override
		public void show() {
			System.out.println("左");
		}
	},
	RIGHT("右") {
		@Override
		public void show() {
			System.out.println("右");
		}
	};

	private Direction2(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public abstract void show();

}
