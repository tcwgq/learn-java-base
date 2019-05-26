package com.tcwgq.domain;

import com.tcwgq.annotation.FruitColor;
import com.tcwgq.annotation.FruitColor.Color;
import com.tcwgq.annotation.FruitName;
import com.tcwgq.annotation.FruitProvider;

public class Apple {
	@FruitName(value = "Apple")
	private String appleName;
	@FruitColor(fruitColor = Color.RED)
	private String appleColor;
	@FruitProvider(id = 1, name = "烟台红富士集团", address = "烟台市富春路88号")
	private String appleProvider;

	public String getAppleName() {
		return appleName;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleColor() {
		return appleColor;
	}

	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}

	public String getAppleProvider() {
		return appleProvider;
	}

	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}

	public void displayName() {
		System.out.println("水果的名字是：苹果");
	}

	@Override
	public String toString() {
		return "Apple [appleName=" + appleName + ", appleColor=" + appleColor
				+ ", appleProvider=" + appleProvider + "]";
	}

}
