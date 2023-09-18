package com.xieajiu;


import org.junit.Assert;
import org.junit.Test;

public class Solution0003Test {

    private final Solution0003 solution = new Solution0003();

    @Test
    public void testCase01() {
        String s = "abcabcbb";
        Assert.assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void testCase02() {
        String s = "bbbbb";
        Assert.assertEquals(1, solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void testCase03() {
        String s = "pwwkew";
        Assert.assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

}