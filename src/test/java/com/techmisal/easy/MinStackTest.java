package com.techmisal.easy;

import org.junit.Assert;
import org.junit.Test;

public class MinStackTest {

    MinStack minStack = new MinStack();


    @Test
    public void testMinStack(){


        minStack.push(12);
        minStack.push(-20);


        Assert.assertEquals(-20,minStack.getMin());


    }



}



