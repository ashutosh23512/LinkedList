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

	public int length() {
		INode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.getnext();
		}
		return count;
	}

	public void insert(INode mynode) {
		if (head == null) {
			this.head = mynode;
			this.tail = mynode;
			return;
		}
		int len = length() / 2;
		INode slow = head;
		INode fast = head.getnext();

		while (fast != null && fast.getnext() != null) {
			slow = slow.getnext();
			fast = fast.getnext().getnext();
		}
		INode temp = slow.getnext();
		slow.setnext(mynode);
		mynode.setnext(temp);

	}

	public INode popfirst() {
		if (head == null) {
			return null;
		}
		head = head.getnext();
		return head;

	}

	public INode poplast() {
		INode tempnode = head;
		if (head == null) {
			return null;
		}
		while (tempnode.getnext() != tail) {
			tempnode = tempnode.getnext();
		}
		tempnode.setnext(null);
		tail = tempnode;
		return head;

	}

	public void print() {
		INode tempnode = head;
		while (tempnode != null) {
			System.out.print(tempnode.getkey() + "->");
			tempnode = tempnode.getnext();
		}
		System.out.println();

	}
}
