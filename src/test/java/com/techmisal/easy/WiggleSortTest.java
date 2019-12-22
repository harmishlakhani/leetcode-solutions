package com.techmisal.easy;

import org.junit.Assert;
import org.junit.Test;

public class WiggleSortTest {
	private WiggleSort wigglesort = new WiggleSort();

	@Test
	public void testWiggleSort() {
		int[] testcase2 = {1, 2, 1, 1, 2, 2}; //only one solution
		int[] rescase2 = {1, 2, 1, 2, 1, 2};

		int[] testcase3 = {1, 2, 2, 3}; //no solution
		int[] rescase3 = null;

		Assert.assertArrayEquals( rescase2, wigglesort.sort(testcase2) );
		Assert.assertArrayEquals( rescase3, wigglesort.sort(testcase3) );
	}
}