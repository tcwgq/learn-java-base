package com.tcwgq.demo;

import java.math.BigDecimal;

/**
 * 构造方法： public BigDecimal(String val)：将BigDecimal的字符串表示形式转换为 BigDecimal。
 * 
 * 成员方法： 
 * public BigDecimal add(BigDecimal augend): 加
 * public BigDecimal subtract(BigDecimal subtrahend):减 
 * public BigDecimal multiply(BigDecimal multiplicand):乘 
 * public BigDecimal divide(BigDecimal divisor):除
 * public BigDecimal divide(BigDecimal divisor,int scale, int roundingMode):返回一个 BigDecimal，其值为 (this / divisor)，其标度为指定标度。
 * 如果必须执行舍入，以生成具有指定标度的结果，则应用指定的舍入模式。
 */
public class BigDecimalDemo1 {
	public static void main(String[] args) {
		System.out.println(new BigDecimal("0.01").add(new BigDecimal("0.09")));
		System.out.println(new BigDecimal("1.0").subtract(new BigDecimal("0.54")));
		System.out.println(new BigDecimal("0.253").multiply(new BigDecimal("100")));
		System.out.println(new BigDecimal("1.034").divide(new BigDecimal("100")));
		System.out.println(new BigDecimal("1.034").divide(new BigDecimal("100"), 3, BigDecimal.ROUND_HALF_UP));
		System.out.println(new BigDecimal("1.034").divide(new BigDecimal("100"), 4, BigDecimal.ROUND_HALF_UP));
		System.out.println(new BigDecimal("1.034").divide(new BigDecimal("100"), 8, BigDecimal.ROUND_HALF_UP));
	}
}
