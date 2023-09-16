package com.xieajiu;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution0050LCPTest {

    private final Solution0050LCP solution = new Solution0050LCP();

    @Test
    public void testCase01() {
        int[] gem = {3,1,2};
        int[][] operations = {{0,2},{2,1},{2,0}};
        assertEquals(2, solution.giveGem(gem, operations));
    }

    @Test
    public void testCase02() {
        int[] gem = {100,0,50,100};
        int[][] operations = {{0,2},{0,1},{3,0},{3,0}};
        assertEquals(75, solution.giveGem(gem, operations));
    }

    @Test
    public void testCase03() {
        int[] gem = {0,0,0,0};
        int[][] operations = {{1,2},{3,1},{1,2}};
        assertEquals(0, solution.giveGem(gem, operations));
    }

}