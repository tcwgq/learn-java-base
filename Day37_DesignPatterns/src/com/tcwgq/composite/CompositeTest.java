package com.tcwgq.composite;

public class CompositeTest {
	public static void main(String[] args) {
		Tree tree = new Tree("A");
		TreeNode node1 = new TreeNode("111");
		TreeNode node2 = new TreeNode("222");
		node1.add(node2);
		tree.getRoot().add(node1);
		System.out.println("build the tree finished");
	}
}
