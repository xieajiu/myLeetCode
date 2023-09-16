package com.xieajiu;

import org.junit.Before;
import org.junit.Test;

public class Solution0136Test {

    private int[] nums;
    private final Solution0136 solution = new Solution0136();

    @Before
    public void setUp() {
        nums = new int[] {1,2,2,3,4,4,3};
    }

    @Test
    public void testCase01() {
        System.out.println(solution.singleNumber(nums));
    }
}