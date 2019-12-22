package com.techmisal.medium;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            StringBuffer range = new StringBuffer();
            int start = i;
            while (i < nums.length - 1 && (nums[i + 1] - nums[i]) == 1) {
                i++;
            }
            if (start == i) {
                result.add(String.valueOf(nums[i]));
            } else {
                range.append(nums[start]);
                range.append("->");
                range.append(nums[i]);
                result.add(range.toString());
            }
        }
        return result;
    }
}
