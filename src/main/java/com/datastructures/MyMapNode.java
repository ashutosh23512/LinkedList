package com.datastructures;

public class MyMapNode<K, V> implements INode<K> {
	K key;
	V value;
	MyMapNode<K, V> next;

	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
		next = null;

	}

	@Override
	public K getkey() {
		return key;
	}

	@Override
	public void setkey(K key) {
		this.key = key;

	}

	@Override
	public INode getnext() {
		return next;
	}

	@Override
	public void setnext(INode next) {
		this.next = (MyMapNode<K, V>) next;
	}

	public V getvalue() {
		return this.value;
	}

	public void setvalue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder mymapnodestring = new StringBuilder();
		mymapnodestring.append(" MyMapNode{ " + "K=").append(key).append(" V=").append(value).append(" }").append(next);
		if (next != null)
			mymapnodestring.append("->").append(next);
		return mymapnodestring.toString();
	}
}
