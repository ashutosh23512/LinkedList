package com.datastructures;

import java.util.ArrayList;

public class MyHashMapPara<K, V> {
	private final int numbuckets;
	ArrayList<LinkedList<K>> mybucketarray;

	public MyHashMapPara() {
		this.numbuckets = 10;
		this.mybucketarray = new ArrayList<>(numbuckets);

		for (int i = 0; i < numbuckets; i++) {
			this.mybucketarray.add(null);
		}
	}

	public V get(K key) {
		int index = this.getbucketindex(key);
		LinkedList<K> mylist = this.mybucketarray.get(index);
		if (mylist == null)
			return null;
		MyMapNode<K, V> mymapnode = (MyMapNode<K, V>) mylist.search1(key);
		return (mymapnode == null) ? null : mymapnode.getvalue();
	}

	private int getbucketindex(K key) {

		int hashcode = Math.abs(key.hashCode());
		int index = hashcode % numbuckets;
		// System.out.println("Key: " + key + " Hashcode: " + hashcode + " Index: " +
		// index);
		return index;
	}

	public void add(K key, V value) {
		int index = this.getbucketindex(key);
		LinkedList<K> mylist = this.mybucketarray.get(index);
		if (mylist == null) {
			mylist = new LinkedList<>();
			this.mybucketarray.set(index, mylist);
		}
		MyMapNode<K, V> mymapnode = (MyMapNode<K, V>) mylist.search1(key);
		if (mymapnode == null) {
			mymapnode = new MyMapNode<>(key, value);
			mylist.append(mymapnode);
		} else
			mymapnode.setvalue(value);
	}

	public void remove(K key) {
		int index = this.getbucketindex(key);
		LinkedList<K> mll = this.mybucketarray.get(index);
		if (mll == null) {
			System.out.println("no such key to remove");
		} else {
			mll.delete1(key);
		}
	}

	@Override
	public String toString() {
		return "MyHashMapPara{ " + mybucketarray + " }";

	}
}
