package com.techmisal.medium;

import org.junit.Assert;
import org.junit.Test;

public class SuperUglyNumberTest {

    private SuperUglyNumber superUglyNumber = new SuperUglyNumber();

    @Test
    public void testSuperUglyNumber() {
        int[] primes = {2, 7, 13, 19};
        int actualResult = superUglyNumber.nthSuperUglyNumber(12, primes);
        Assert.assertEquals(actualResult, 32);
    }
}
