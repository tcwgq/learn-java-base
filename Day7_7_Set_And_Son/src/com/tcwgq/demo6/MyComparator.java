
package com.tcwgq.demo6;

import java.util.Comparator;

public class MyComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int a = o1.getAge() - o2.getAge();
		int b = a == 0 ? o1.getName().compareTo(o2.getName()):a;
		return b;
	}

}
