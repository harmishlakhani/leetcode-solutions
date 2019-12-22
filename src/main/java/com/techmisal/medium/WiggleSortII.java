package com.techmisal.easy;

/* 
Goal: sort a given array of integers so that every second number is greater than both of its adjacents

Method: sort numbers first, then split and rearrange

Fail-Case: if a wiggle sort is impossible e.g. {1, 1, 1}, return null
*/


public class WiggleSortII {
	public int[] sort(int[] array) {
    if (array.length == 1) return array;

    //sort array with bubblesort
    for (int j = 0; j < array.length-1; j++) { //takes (arraylength-1) moves to get highest number from left to right (worst-case)
      for (int i = 0; i < array.length-1; i++) {
        if (array[i] > array[i+1]) {
          swap(array, i, i+1);
        }
      }
    }

    int lowmid = (int)(array.length/2)-1;
    //check failcase
    if (array.length > 2) {	
      if (array[lowmid] == array[lowmid+1]) {
        if (array.length % 2 == 0 || array.length % 2 == 1 && array[lowmid+2] == array[lowmid]) {
          return null;
        } 
      }
    }

    //rearrange
    int[] narray = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      if (i % 2 == 0) {
        narray[i] = array[(int)(i / 2)];
      } else {
        narray[i] = array[lowmid + 1 + (int)(i / 2)];
      }
    }

    return narray;
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}