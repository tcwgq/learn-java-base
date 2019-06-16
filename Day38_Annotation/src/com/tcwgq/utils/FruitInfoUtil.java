package com.tcwgq.utils;

import java.lang.reflect.Field;

import com.tcwgq.annotation.FruitColor;
import com.tcwgq.annotation.FruitName;
import com.tcwgq.annotation.FruitProvider;

public class FruitInfoUtil {
	public static void getFruitInfo(Class<?> clazz) {
		String strFruitName = " 水果名称：";
		String strFruitColor = " 水果颜色：";
		String strFruitProvicer = "供应商信息：";
		Field[] fields = clazz.getDeclaredFields();// 返回 Field 对象的一个数组，这些对象反映此
													// Class
													// 对象所表示的类或接口所声明的所有字段。不包括继承的。
		for (Field field : fields) {
			if (field.isAnnotationPresent(FruitName.class)) {// 如果指定类型的注释存在于此元素上，则返回
																// true，否则返回
																// false。
				FruitName fruitName = (FruitName) field
						.getAnnotation(FruitName.class);// 如果存在该元素的指定类型的注释，则返回这些注释，否则返回
														// null。
				strFruitName = strFruitName + fruitName.value();
				System.out.println(strFruitName);
			} else if (field.isAnnotationPresent(FruitColor.class)) {
				FruitColor fruitColor = (FruitColor) field
						.getAnnotation(FruitColor.class);
				strFruitColor = strFruitColor
						+ fruitColor.fruitColor().toString();
				System.out.println(strFruitColor);
			} else if (field.isAnnotationPresent(FruitProvider.class)) {
				FruitProvider fruitProvider = (FruitProvider) field
						.getAnnotation(FruitProvider.class);
				strFruitProvicer = " 供应商编号：" + fruitProvider.id() + " 供应商名称："
						+ fruitProvider.name() + " 供应商地址："
						+ fruitProvider.address();
				System.out.println(strFruitProvicer);
			}
		}
	}
}
