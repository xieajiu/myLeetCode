package com.xieajiu;

/**
 * <a href="https://leetcode.cn/problems/single-number/">136. 只出现一次的数字</a>
 * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 *
 */
public class Solution0136 {

    /**
     * 寻找只出现一次的数字
     * 最优解：使用异或运算
     * @param nums 数组
     * @return 单次出现的数字
     */
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}