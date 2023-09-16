package com.xieajiu;

import java.util.*;

/**
 * <a href="https://leetcode.cn/problems/intersection-of-two-arrays-ii/">350. 两个数组的交集 II</a>
 * 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。
 * 返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 *
 */
public class Solution0350 {

    /**
     * 寻找交集
     * 最优解：使用异或运算
     * @param nums1 数组
     * @param nums2 数组
     * @return 交集
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        // 使用最小的数组
        if (nums1.length > nums2.length) {
            intersect(nums2, nums1);
        }
        Map<Integer, Integer> numHash = new HashMap<>(nums1.length);
        for (int num : nums1) {
            if (numHash.containsKey(num)) {
                numHash.put(num, numHash.get(num) + 1);
            } else {
                numHash.put(num, 1);
            }
        }
        int[] result = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            if (numHash.containsKey(num) && numHash.get(num) != 0) {
                result[index++] = num;
                numHash.put(num, numHash.get(num) - 1);
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }
}