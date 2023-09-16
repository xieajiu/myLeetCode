package com.xieajiu;

/**
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * <a href="https://leetcode.cn/problems/rotate-array/">题目地址</a>
 */
public class Solution0189 {

    /**
     * 轮转数组
     * @param nums 数组
     * @param k 步长
     */
    public void rotate(int[] nums, int k) {
        // 跳转次数
        k = k % nums.length;
        /**
         * next --> 下个元素的坐标
         * moveCount --> 循环的次数
         * temp --> 迁移的值
         * startIndex --> 起始下标
         */
        for (int next = 0, moveCount = 0, temp = nums[0], startIndex = 0; moveCount < nums.length; moveCount++) {
            next = (next + k) % nums.length;
            temp = temp ^ nums[next];
            nums[next] = temp ^ nums[next];
            temp = temp ^ nums[next];
            if (next % nums.length == startIndex && startIndex < nums.length - 1) {
                next = ++startIndex;
                temp = nums[next];
            }
        }
    }
}
