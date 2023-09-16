package com.xieajiu;

import org.junit.Before;
import org.junit.Test;

public class Solution0217Test {

    private int[] nums;
    private final Solution0217 solution = new Solution0217();

    @Before
    public void setUp() {
        nums = new int[] {1,2,3,4,5,6};
//        nums = new int[] {1};
    }

    @Test
    public void testCase01() {
        System.out.println(solution.containsDuplicate(nums));
    }
}