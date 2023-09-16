package com.xieajiu;


/**
 * <a href="https://leetcode.cn/problems/single-number/">283. 移动零</a>
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 *
 */
public class Solution0283 {

    /**
     * 移动零
     * @param nums 数组
     */
    public void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        int notZeroIndex = 1;
        while (zeroIndex < nums.length - 1) {
            if (notZeroIndex >= nums.length) {
                break;
            }
            if (nums[zeroIndex] == 0) {
                if (nums[notZeroIndex] == 0) {
                    notZeroIndex++;
                } else {
                    nums[zeroIndex] = nums[zeroIndex] ^ nums[notZeroIndex];
                    nums[notZeroIndex] = nums[zeroIndex] ^ nums[notZeroIndex];
                    nums[zeroIndex] = nums[zeroIndex] ^ nums[notZeroIndex];
                    zeroIndex++;
                    notZeroIndex++;
                }
            } else {
                zeroIndex++;
                notZeroIndex++;
            }
        }
    }
}