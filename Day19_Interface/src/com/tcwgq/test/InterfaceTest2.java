package com.tcwgq.test;

/**
 * 教练和运动员案例(学生分析然后讲解) 乒乓球运动员和篮球运动员。 
 * 乒乓球教练和篮球教练。 为了出国交流，跟乒乓球相关的人员都需要学习英语。
 * 请用所学知识：分析，这个案例中有哪些抽象类，哪些接口，哪些具体类。
 */
public class InterfaceTest2 {
	public static void main(String[] args) {
		BasketballPlayer bp = new BasketballPlayer("aaa", 19);
		System.out.println(bp.getName() + "--" + bp.getAge());
		bp.eat();
		bp.sleep();
		bp.study();
		bp.speakEnglish();
		System.out.println("---------------");
		PingPongPlayer ppp = new PingPongPlayer("bbb", 20);
		System.out.println(ppp.getName() + "--" + ppp.getAge());
		ppp.eat();
		ppp.sleep();
		ppp.study();
		ppp.speakEnglish();
		System.out.println("----------------");
		// 教练的不再测试
	}
}

interface SpeakEnglish {
	public abstract void speakEnglish();
}

abstract class Per {
	private String name;
	private int age;

	public Per() {
		super();
	}

	public Per(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract void eat();

	public void sleep() {
		System.out.println("睡觉");
	}

}

abstract class Player extends Per {

	public Player() {
		super();
	}

	public Player(String name, int age) {
		super(name, age);
	}

	public abstract void study();

}

abstract class Coach extends Per {

	public Coach() {
		super();
	}

	public Coach(String name, int age) {
		super(name, age);
	}

	public abstract void teach();
}

class BasketballPlayer extends Player implements SpeakEnglish {

	public BasketballPlayer() {
		super();
	}

	public BasketballPlayer(String name, int age) {
		super(name, age);
	}

	@Override
	public void speakEnglish() {
		System.out.println("篮球运动员会说英语了");
	}

	@Override
	public void eat() {
		System.out.println("篮球运动员喜欢吃鸡蛋");
	}

	@Override
	public void study() {
		System.out.println("篮球运动员学习跳高");
	}

}

class PingPongPlayer extends Player implements SpeakEnglish {

	public PingPongPlayer() {
		super();
	}

	public PingPongPlayer(String name, int age) {
		super(name, age);
	}

	@Override
	public void speakEnglish() {
		System.out.println("乒乓球运动员会说英语了");
	}

	@Override
	public void eat() {
		System.out.println("乒乓球运动员喜欢吃狗肉");
	}

	@Override
	public void study() {
		System.out.println("乒乓球运动员学习发球");
	}

}

class BasketballCoach extends Coach implements SpeakEnglish {

	public BasketballCoach() {
		super();
	}

	public BasketballCoach(String name, int age) {
		super(name, age);
	}

	@Override
	public void speakEnglish() {
		System.out.println("篮球教练会说英语了");
	}

	@Override
	public void eat() {
		System.out.println("篮球教练喜欢吃肉");
	}

	@Override
	public void teach() {
		System.out.println("篮球教练教打篮球");
	}

}

class PingPongCoach extends Coach implements SpeakEnglish {

	public PingPongCoach() {
		super();
	}

	public PingPongCoach(String name, int age) {
		super(name, age);
	}

	@Override
	public void speakEnglish() {
		System.out.println("乒乓球教练会说英语了");
	}

	@Override
	public void eat() {
		System.out.println("乒乓球教练喜欢吃素");
	}

	@Override
	public void teach() {
		System.out.println("乒乓球教练教打乒乓球s");
	}

}