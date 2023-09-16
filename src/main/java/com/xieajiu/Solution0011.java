package com.xieajiu;

/**
 * <a href="https://leetcode.cn/problems/container-with-most-water/">11. 盛最多水的容器</a>
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。
 * 说明：你不能倾斜容器。
 *
 */
public class Solution0011 {

    /**
     * 此方法超出时间限制
     * @param height x轴的长度
     * @return 最大面积
     */
    public int maxArea(int[] height) {
        if (height.length == 2) {
            return Math.min(height[0], height[1]);
        }

        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    /**
     * 使用双指针解决
     * @param height x轴的长度
     * @return 最大面积
     */
    public int maxAreaWithDoublePoint(int[] height) {
        int maxArea = 0;
        for (int start=0, end = height.length - 1; start < height.length && start < end;) {
            // 计算当前容量
            int area = (end - start) * Math.min(height[start], height[end]);
            // 获取最大容量
            maxArea = Math.max(area, maxArea);
            if (height[start] < height[end]) {
                start++;
            } else  {
                end--;
            }
        }
        return maxArea;
    }
}
