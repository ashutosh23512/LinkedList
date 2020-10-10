package com.datastructures;

import org.junit.*;

public class DataStrucTest {

	@Test
	public void LinkedList_add() {
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
		DataStruc<Integer> firstnodeappend = new DataStruc<Integer>(56);
		DataStruc<Integer> secondnodeappend = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnodeappend = new DataStruc<Integer>(70);
		LinkedList list = new LinkedList();
		list.append(firstnodeappend);
		list.append(secondnodeappend);
		list.append(thirdnodeappend);
		list.print();
	}
}
