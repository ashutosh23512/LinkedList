package com.datastructures;

public class LinkedList {

	INode head;
	INode tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode mynode) {
		if (head == null) {
			this.head = mynode;
			this.tail = mynode;
		} else {
			mynode.setnext(head);
			this.head = mynode;

		}
	}

}
