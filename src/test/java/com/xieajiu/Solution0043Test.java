package com.xieajiu;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution0043Test {

    private static final Solution0043 solution = new Solution0043();

    @Test
    public void testCase01() {
        assertEquals("100", solution.multiply("10", "10"));
        assertEquals("121", solution.multiply("11", "11"));
        assertEquals((999 * 11) + "", solution.multiply("999", "11"));
    }


}