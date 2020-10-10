package com.datastructures;

import org.junit.*;

public class DataStrucTest {

	@Test
	public void LinkedList_add() {
		System.out.println("Add:");
		DataStruc<Integer> firstnodeadd = new DataStruc<Integer>(70);
		DataStruc<Integer> secondnodeadd = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnodeadd = new DataStruc<Integer>(56);

		LinkedList list = new LinkedList();
		list.add(firstnodeadd);
		list.add(secondnodeadd);
		list.add(thirdnodeadd);
		list.print();

	}

	@Test
	public void LinkedList_append() {
		System.out.println("Append:");

		DataStruc<Integer> firstnodeappend = new DataStruc<Integer>(56);
		DataStruc<Integer> secondnodeappend = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnodeappend = new DataStruc<Integer>(70);
		LinkedList list = new LinkedList();
		list.append(firstnodeappend);
		list.append(secondnodeappend);
		list.append(thirdnodeappend);
		list.print();
	}

	@Test
	public void LinkedList_insert() {
		System.out.println("Insert:");

		DataStruc<Integer> firstnodeappend = new DataStruc<Integer>(56);
		DataStruc<Integer> secondnodeappend = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnodeappend = new DataStruc<Integer>(70);
		LinkedList list = new LinkedList();
		list.append(firstnodeappend);
		list.append(thirdnodeappend);
		list.print();
		list.insert(secondnodeappend);
		list.print();
	}

	@Test
	public void LinkedList_pop_first() {
		System.out.println("Pop First:");

		DataStruc<Integer> firstnodeappend = new DataStruc<Integer>(56);
		DataStruc<Integer> secondnodeappend = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnodeappend = new DataStruc<Integer>(70);
		LinkedList list = new LinkedList();
		list.append(firstnodeappend);
		list.append(secondnodeappend);
		list.append(thirdnodeappend);
		list.print();
		list.popfirst();
		list.print();
	}

	@Test
	public void LinkedList_pop_last() {
		System.out.println("Pop Last:");

		DataStruc<Integer> firstnodeappend = new DataStruc<Integer>(56);
		DataStruc<Integer> secondnodeappend = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnodeappend = new DataStruc<Integer>(70);
		LinkedList list = new LinkedList();
		list.append(firstnodeappend);
		list.append(secondnodeappend);
		list.append(thirdnodeappend);
		list.print();
		list.poplast();
		list.print();
	}

	@Test
	public void LinkedList_search() {
		System.out.println("Search:");

		DataStruc<Integer> firstnodeappend = new DataStruc<Integer>(56);
		DataStruc<Integer> secondnodeappend = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnodeappend = new DataStruc<Integer>(70);
		LinkedList list = new LinkedList();
		list.append(firstnodeappend);
		list.append(secondnodeappend);
		list.append(thirdnodeappend);
		list.print();
		int index = list.search(30);
		System.out.println(index);

	}
}
