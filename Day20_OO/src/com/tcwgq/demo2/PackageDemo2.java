package com.tcwgq.demo2;

/**
 * 导包概述 
 * 不同包下的类之间的访问，我们发现，每次使用不同包下的类的时候，都需要加包的全路径。比较麻烦。
 * 这个时候，java就提供了导包的功能。 
 * 导包格式 import 包名; 
 * 注意： 这种方式导入是到类的名称。 虽然可以最后写*，但是不建议。 
 * package,import,class有没有顺序关系(面试题)
 * 有，package > import > class
 * 注意细节：
 * package:一个文件中只能有一个
 * import:一个文件中可以有多个
 * class:与一个文件中可以有多个，建议只写一个
 */
public class PackageDemo2 {
	public static void main(String[] args) {

	}
}
