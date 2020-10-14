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

}
