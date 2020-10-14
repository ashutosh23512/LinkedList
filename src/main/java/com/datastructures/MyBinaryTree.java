package com.datastructures;

public class MyBinaryTree<K extends Comparable<K>> {

	private MyBinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRec(root, key);
	}

	private MyBinaryNode<K> addRec(MyBinaryNode<K> curr, K key) {
		if (curr == null)
			return new MyBinaryNode<>(key);
		int compareRes = key.compareTo(curr.key);
		if (compareRes == 0)
			return curr;
		if (compareRes < 0)
			curr.left = addRec(curr.left, key);
		else
			curr.right = addRec(curr.right, key);
		return curr;
	}

	public int getsize() {
		return this.getsizerec(root);
	}

	private int getsizerec(MyBinaryNode<K> curr) {
		return curr == null ? 0 : 1 + this.getsizerec(curr.left) + this.getsizerec(curr.right);
	}

}
