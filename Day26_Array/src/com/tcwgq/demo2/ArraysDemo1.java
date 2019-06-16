package com.tcwgq.demo2;

/**
 * Arrays的方法toString(int[] arr)的原码解析
 * Arrays的方法binarySearch(int[] a, int key)原码解析
 */
public class ArraysDemo1 {
	public static void main(String[] args) {
		int[] arr = { 13, 24, 57, 69, 80 };
	}

	public static int binarySearch0(int[] a, int fromIndex, int toIndex, int key) {
		int low = fromIndex;
		int high = toIndex - 1;
		while (low <= high) {
			int mid = (low + high) >>> 1;//无符号右移1位代替/2，这样效率更高
			int midVal = a[mid];
			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid; // key found
		}
		//{ 13, 24, 57, 69, 80 }
		//   0   1   2   3   4
		//  low             high
		return -(low + 1); // key not found.
	}

	public static String toString(short[] a) {
		if (a == null)
			return "null";
		int iMax = a.length - 1;
		if (iMax == -1)
			return "[]";//空数组

		StringBuilder b = new StringBuilder();
		b.append('[');
		for (int i = 0;; i++) {
			b.append(a[i]);
			if (i == iMax)
				return b.append(']').toString();
			b.append(", ");
		}
	}
}
