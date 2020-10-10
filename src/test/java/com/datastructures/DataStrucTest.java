package com.datastructures;

import org.junit.*;

public class DataStrucTest {

	@Test
	public void LinkedList() {
		DataStruc<Integer> firstnode = new DataStruc<Integer>(70);
		DataStruc<Integer> secondnode = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnode = new DataStruc<Integer>(56);

		LinkedList list = new LinkedList();
		list.add(firstnode);
		list.add(secondnode);
		list.add(thirdnode);

	}
}
