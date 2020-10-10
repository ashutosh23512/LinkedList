package com.datastructures;

public interface INode<K> {

	K getkey();

	void setkey(K key);

	INode getnext();

	void setnext(INode next);

}
