package com.techmisal.easy;
/*

Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.


 */
public class PlusOne {


    public int[] addOne(int[] arr) {


        int len = arr.length - 1;
        int dividend = 0;

        if(arr.length == 0){
            return arr;
        }


        do {

            int add = dividend == 0 ? 1 : dividend;
            int x = arr[len];
            arr[len] = (x + add) % 10;
            dividend = (x + add) / 10;
            len--;


        } while (dividend != 0 && len >= 0);


        if (dividend == 1) {


            int[] array = new int[arr.length + 1];
            for (int i = arr.length - 1; i >= 0; i--) {
                array[i + 1] = arr[i];
            }

            array[0] = dividend;

            return array;
        }

        return arr;

    }


}
