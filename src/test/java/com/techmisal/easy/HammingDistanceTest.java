package com.techmisal.easy;

import org.junit.Assert;
import org.junit.Test;

public class HammingDistanceTest {



    private HammingDistance hammingDistance = new HammingDistance();

    @Test
    public void testHammingDistance(){

        Assert.assertEquals(2,hammingDistance.hammingDistance(1,4));

    }

}
