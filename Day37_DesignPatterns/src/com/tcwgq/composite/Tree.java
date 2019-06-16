package com.tcwgq.composite;

public class Tree {
	private TreeNode root = null;

	public Tree(String name) {
		super();
		this.root = new TreeNode(name);
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

}
