package com.xieajiu;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution0013Test {

    private final Solution0013 solution = new Solution0013();

    @Test
    public void testCase01() {
        assertEquals(3, solution.romanToInt("III"));
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(58, solution.romanToInt("LVIII"));
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}