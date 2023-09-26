package com.xieajiu;

import java.util.*;

/**
 * <a href="https://leetcode.cn/problems/3sum/description/" >15.三数之和</a><br />
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] <br />
 * 满足 i != j、i != k 且 j != k ，<br />
 * 同时还满足 nums[i] + nums[j] + nums[k] == 0 。<br />
 * 请你返回所有和为 0 且不重复的三元组。<br />
 *
 * 注意：答案中不可以包含重复的三元组。<br />
 */
public class Solution0015 {

    public List<List<Integer>> threeSum(int[] nums) {
        // step1. 排序, 从小到大
        Arrays.sort(nums);
        int head = 0;
        List<List<Integer>> result = new ArrayList<>();
        while (head < nums.length - 2) {
            if (nums[head] + nums[head + 1] + nums[head + 2] == 0) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[head]);
                list.add(nums[head + 1]);
                list.add(nums[head + 2]);
                result.add(list);
                break;
            } else if (nums[head] + nums[head + 1] + nums[head + 2] > 0) {
                break;
            } else {
                for (int i = head + 1, j = nums.length - 1; i < j;) {
                    if (nums[head] + nums[i] + nums[j] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[head]);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        result.add(list);
                        break;
                    } else if (nums[head] + nums[i] + nums[j] < 0) {
                        while (nums[i] == nums[++i]);
                    } else {
                        while (nums[j] == nums[--j]);
                    }
                }
            }
            while (nums[head] == nums[++head]);
        }
        return result;
    }

}
