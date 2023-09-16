package com.xieajiu;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/single-number/">66. 加一</a>
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 */
public class Solution0066 {

    /**
     * 寻找只出现一次的数字
     * 最优解：使用异或运算
     * @param digits 数组
     * @return 加1 之后的数
     */
    public int[] plusOne(int[] digits) {
        int num = 1;
        int[] result = new int[digits.length + 1];
        int sum = 0;
        for (int  i = digits.length - 1; i >= 0; i--) {
            // 1、计算和
            sum = digits[i] + num;
            // 进位判断
            num = sum / 10 > 0 ? 1 : 0;
            result[i+1] = sum % 10;
        }
        if (num == 0) {
            return Arrays.copyOfRange(result, 1, result.length);
        } else {
            result[0] = 1;
            return result;
        }
    }
}