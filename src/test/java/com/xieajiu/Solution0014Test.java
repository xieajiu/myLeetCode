package com.xieajiu;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution0014Test {

    private final Solution0014 solution = new Solution0014();

    @Test
    public void testCase01() {
        assertEquals("fl", solution.longestCommonPrefix(new String[] {"flower","flow","flight"}));
        assertEquals("", solution.longestCommonPrefix(new String[] {"dog","racecar","car"}));
        assertEquals("a", solution.longestCommonPrefix(new String[] {"a"}));
    }
}