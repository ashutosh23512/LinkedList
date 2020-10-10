package com.datastructures;

import static org.junit.Assert.assertEquals;

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
		INode pop = list.popfirst();
		list.print();
		Assert.assertEquals(secondnodeappend, pop);
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
		INode pop = list.poplast();
		list.print();
		Assert.assertEquals(firstnodeappend, pop);

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
		int i = list.search(30);
		Assert.assertEquals(2, i);

	}

	@Test
	public void LinkedList_insert_at() {
		System.out.println("Insert at:");

		DataStruc<Integer> firstnodeappend = new DataStruc<Integer>(56);
		DataStruc<Integer> secondnodeappend = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnodeappend = new DataStruc<Integer>(70);
		LinkedList list = new LinkedList();
		list.append(firstnodeappend);
		list.append(secondnodeappend);
		list.append(thirdnodeappend);
		list.print();
		DataStruc<Integer> fourthnodeappend = new DataStruc<Integer>(40);
		INode first = secondnodeappend.getnext();

		list.insertat(fourthnodeappend, 30);
		list.print();
		INode sec = fourthnodeappend.getnext();
		boolean result = false;
		if (first == sec) {
			result = true;
		}
		assertEquals(true, result);
		list.print();
	}

	@Test
	public void LinkedList_delete_at() {
		System.out.println("Delete at:");

		DataStruc<Integer> firstnodeappend = new DataStruc<Integer>(56);
		DataStruc<Integer> secondnodeappend = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnodeappend = new DataStruc<Integer>(40);
		DataStruc<Integer> fourthnodeappend = new DataStruc<Integer>(70);
		LinkedList list = new LinkedList();
		list.append(firstnodeappend);
		list.append(secondnodeappend);
		list.append(thirdnodeappend);
		list.append(fourthnodeappend);
		list.print();
		INode first = thirdnodeappend.getnext();
		list.deleteat(40);
		INode sec = secondnodeappend.getnext();
		boolean result = false;
		if (first == sec) {
			result = true;
		}
		assertEquals(true, result);
		list.print();

	}
}
