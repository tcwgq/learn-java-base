package com.tcwgq.demo8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常注意事项： A:子类重写父类方法时，子类的方法必须抛出相同的异常或父类异常的子类。(父亲坏了,儿子不能比父亲更坏)。
 * B:如果父类抛出了多个异常,子类重写父类时,只能抛出相同的异常或者是他的子集,子类不能抛出父类没有的异常，不解释，和A情况原理相同。
 * C:如果被重写的方法没有异常抛出,那么子类的方法绝对不可以抛出异常,如果子类方法内有异常发生,那么子类只能try,不能throws。
 */
public class ExceptionDemo {

}

class Father {
	public void show() throws Exception {

	}

	public void fun() {

	}
}

class Son extends Father {
	@Override
	public void show() throws ArithmeticException {

	}

	@Override
	public void fun() {
		String s = "2015-11-1";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = sdf.parse(s);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}