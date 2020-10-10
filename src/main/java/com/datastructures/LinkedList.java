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

	public void append(INode mynode) {
		if (head == null) {
			this.head = mynode;
			this.tail = mynode;
		} else {
			this.tail.setnext(mynode);
			this.tail = tail.getnext();
		}
	}
	public void print() {
		INode tempnode = head;
		while (tempnode != null) {
			System.out.print(tempnode.getkey()+"->");
			tempnode = tempnode.getnext();
		}
		System.out.println();

	}
}
