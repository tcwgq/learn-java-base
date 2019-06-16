package com.tcwgq.demo7;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import org.junit.Test;

/**
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台。
 */
public class TreeSetDemo {
	@Test
	public void fun() {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				int a = o1.getScore() - o2.getScore();
				int b = a == 0 ? o1.getChinese() - o2.getChinese() : a;
				int c = b == 0 ? o1.getEnglish() - o2.getEnglish() : b;
				int d = c == 0 ? o1.getMath() - o2.getMath() : c;// 这步可以省略，总分和语数成绩都相同，英语成绩必相同
				return d;
			}
		});
		for (int i = 1; i <= 5; i++) {
			System.out.println("请输入第" + i + "个学生的信息：");
			System.out.println("姓名：");
			String name = sc1.nextLine();
			System.out.println("语文成绩：");
			int chinese = sc2.nextInt();
			System.out.println("数学成绩：");
			int math = sc2.nextInt();
			System.out.println("英语成绩：");
			int english = sc2.nextInt();
			Student s = new Student(name, chinese, math, english);
			ts.add(s);
		}
		for (Student s : ts) {
			System.out.println("姓名：" + s.getName() + ",语文成绩：" + s.getChinese() + ",数学成绩" + s.getMath() + ",英语成绩："
					+ s.getEnglish() + ",总分：" + s.getScore());
		}
		sc1.close();
		sc2.close();
	}

}
