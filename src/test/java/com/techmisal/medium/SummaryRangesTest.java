package com.techmisal.medium;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SummaryRangesTest {

    private SummaryRanges summaryRanges = new SummaryRanges();

    @Test
    public void testSummaryRanges1() {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> actualResult = summaryRanges.summaryRanges(nums);
        Assert.assertEquals("0->2", actualResult.get(0));
        Assert.assertEquals("4->5", actualResult.get(1));
        Assert.assertEquals("7", actualResult.get(2));
    }

    @Test
    public void testSummaryRanges2() {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        List<String> actualResult = summaryRanges.summaryRanges(nums);
        Assert.assertEquals("0", actualResult.get(0));
        Assert.assertEquals("2->4", actualResult.get(1));
        Assert.assertEquals("6", actualResult.get(2));
        Assert.assertEquals("8->9", actualResult.get(3));
    }
}
