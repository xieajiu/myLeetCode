package com.xieajiu;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Solution0350Test {

    private int[] nums1;
    private int[] nums2;
    private final Solution0350 solution = new Solution0350();

    @Before
    public void setUp() {
        nums1 = new int[] {1,2,2,1};
        nums2 = new int[] {2,2};
    }

    @Test
    public void testCase01() {
        System.out.println(Arrays.toString(solution.intersect(nums1, nums2)));
    }
}