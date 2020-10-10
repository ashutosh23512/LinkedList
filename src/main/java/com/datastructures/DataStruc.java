package com.datastructures;

public class DataStruc<K> implements INode<K> {

	private K key;
	private INode next;

	public DataStruc(K key) {
		this.key = key;
		this.next = null;
	}

	public INode<K> getnext() {
		return next;
	}

	public K getkey() {
		return key;
	}

	public void setkey(K key) {
		this.key = key;
	}

	public void setnext(INode next) {
		this.next = next;
	}

}
