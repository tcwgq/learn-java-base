package com.tcwgq.exercise4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import org.junit.Test;

public class SortScoreDemo {
	/**
	 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低存入文本文件。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException {
		Scanner sc = new Scanner(System.in);
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int sum1 = s2.getSum() - s1.getSum();
				int sum2 = sum1 == 0 ? s2.getChinese() - s1.getChinese() : sum1;
				int sum3 = sum2 == 0 ? s2.getMath() - s1.getMath() : sum2;
				int sum4 = sum3 == 0 ? s2.getEnglish() - s1.getEnglish() : sum3;
				int sum5 = sum4==0? s2.getName().compareTo(s1.getName()):sum4;
				return sum5;
			}
		});
		for (int i = 1; i <= 5; i++) {
			Student s = new Student();
			System.out.println("请输入第" + i + "个学生的姓名：");
			String name = sc.nextLine();
			System.out.println("请输入第" + i + "个学生的语文成绩：");
			int chinese = sc.nextInt();
			System.out.println("请输入第" + i + "个学生的数学成绩：");
			int math = sc.nextInt();
			System.out.println("请输入第" + i + "个学生的英语成绩：");
			int english = sc.nextInt();
			//注意此处会将换行符读取到
			sc.nextLine();
			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);
			ts.add(s);
		}
		sc.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
		for (Student s : ts) {
			System.out.println("姓名：" + s.getName() + "总分：" + s.getSum());
			bw.write(s.getName()+"="+s.getSum());
			bw.newLine();
		}
		bw.close();
	}

}
