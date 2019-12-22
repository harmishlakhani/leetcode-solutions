package com.techmisal.easy;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {

    PlusOne one  = new PlusOne();


    @Test
    public void testOnePlus(){

        Assert.assertArrayEquals(new int[]{1,0,0,0},one.addOne(new int[]{9,9,9}));
        Assert.assertArrayEquals(new int[]{1,2,4},one.addOne(new int[]{1,2,3}));
        Assert.assertArrayEquals(new int[]{},one.addOne(new int[]{}));
        Assert.assertArrayEquals(new int[]{0,0,1},one.addOne(new int[]{0,0,0}));
        Assert.assertArrayEquals(new int[]{2,0,0},one.addOne(new int[]{1,9,9}));
        Assert.assertArrayEquals(new int[]{1,0,0,0,0,0},one.addOne(new int[]{9,9,9,9,9}));


    }


}
