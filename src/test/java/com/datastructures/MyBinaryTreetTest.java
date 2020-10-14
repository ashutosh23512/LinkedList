package com.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreetTest {

	@Test
	public void MyTreeTest() {

		MyBinaryTree<Integer> mbt = new MyBinaryTree<>();
		mbt.add(56);
		mbt.add(30);
		mbt.add(70);

		int size = mbt.getsize();
		System.out.println(size);
		Assert.assertEquals(3, size);

	}

	@Test
	public void MyTreeTestFull() {

		MyBinaryTree<Integer> mbt = new MyBinaryTree<>();
		mbt.add(56);
		mbt.add(30);
		mbt.add(70);
		mbt.add(22);
		mbt.add(40);
		mbt.add(11);
		mbt.add(3);
		mbt.add(16);
		mbt.add(60);
		mbt.add(95);
		mbt.add(65);
		mbt.add(63);
		mbt.add(67);

		int size = mbt.getsize();
		System.out.println(size);
		Assert.assertEquals(13, size);

	}

	@Test
	public void MyTreeTestSearch() {

		MyBinaryTree<Integer> mbt = new MyBinaryTree<>();
		mbt.add(56);
		mbt.add(30);
		mbt.add(70);
		mbt.add(22);
		mbt.add(40);
		mbt.add(11);
		mbt.add(3);
		mbt.add(16);
		mbt.add(60);
		mbt.add(95);
		mbt.add(65);
		mbt.add(63);
		mbt.add(67);

		boolean found = mbt.searchnode(11);
		Assert.assertEquals(true, found);

	}

}
