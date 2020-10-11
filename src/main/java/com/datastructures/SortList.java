package com.datastructures;

public class SortList<K extends Comparable<K>> {
	INode<K> head;
	INode<K> tail;

	public void sortList(INode<K> node) {
		INode<K> temp1 = head;
		INode<K> temp2 = null;
		while (temp1 != null && node.getkey().compareTo(temp1.getkey()) > 0) {
			temp2 = temp1;
			temp1 = temp1.getnext();
		}
		if (temp2 == null) {
			this.head = node;
		} else {
			temp2.setnext(node);
		}
		node.setnext(temp1);
		while (temp1 != null) {
			this.tail = temp1;
			temp1 = temp1.getnext();
		}

	}

}
