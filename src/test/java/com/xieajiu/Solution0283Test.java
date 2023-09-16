package com.xieajiu;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Solution0283Test {

    private int[] nums;
    private final Solution0283 solution = new Solution0283();

    @Before
    public void setUp() {
        nums = new int[] {1,2,2,3,4,4,3};
    }

    @Test
    public void testCase01() {
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}