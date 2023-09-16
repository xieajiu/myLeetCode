package com.xieajiu;

import org.junit.Before;
import org.junit.Test;

public class Solution0189Test {

    private int[] nums;
    private Solution0189 solution = new Solution0189();

    @Before
    public void setUp() {
//        nums = new int[] {1,2,3,4,5,6};
        nums = new int[] {1};
    }

    @Test
    public void testCase01() {
        solution.rotate(nums, 0);
    }
}