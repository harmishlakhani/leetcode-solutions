package com.techmisal.medium;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductOfWordLengthsTest {
    private MaximumProductOfWordLengths solver = new MaximumProductOfWordLengths();

    @Test
    public void test() {
        Assert.assertEquals(0, solver.calculate(new String[] { "a", "aa", "aaa", "aaaa" }));
        Assert.assertEquals(16, solver.calculate(new String[] { "abcw", "baz", "foo", "bar", "xtfn", "abcdef" }));
        Assert.assertEquals(4, solver.calculate(new String[] { "a", "ab", "abc", "d", "cd", "bcd", "abcd" }));
    }
}
