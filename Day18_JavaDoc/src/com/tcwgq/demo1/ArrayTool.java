package com.tcwgq.demo1;

/**
 * <p>
 * 这是用于数组操作的工具类
 * </p>
 * <p>
 * 这是用于数组操作的工具类第二行
 * </p>
 * 
 * @author tcwgq
 * @version 1.0
 * @since 1.8
 */
class ArrayTool {
	/**
	 * 私有的无参构造方法 在帮助文档中不显示信息
	 */
	private ArrayTool() {

	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.println(array[i]);
			}
		}
	}

	/**
	 * 获取数组最大值得函数
	 * <p>
	 * 注意，这个数组必须是整型数组
	 * </p>
	 * 
	 * @param arr
	 *            数组的名字
	 * @return 数组中的最大值
	 */
	public static int getMax(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int getMin(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	/**
	 * 查找指定元素在数组中第一次出现的索引
	 * 
	 * @param arr
	 *            数组的名称
	 * @param num
	 *            带查找的指定元素
	 * @return 指定元素存在，返回其在数组中第一次出现的索引；指定元素不存在，返回-1
	 */
	public static int getIndex(int[] array, int num) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
}
