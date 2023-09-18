package com.xieajiu;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/single-number/">3. 无重复字符的最长子串</a>
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 */
public class Solution0003 {

    public int lengthOfLongestSubstring(String s) {
        // 记录字符最近出现的位置
        Map<Character, Integer> existedChars = new HashMap<>(32);
        int head = 0;
        // 最大字符长度
        int maxLength = 0;
        // 当前字符长度
        int currentLength = 0;
        for (int tail = 0; tail < s.length(); tail++) {
            char indexChar = s.charAt(tail);
            if (existedChars.containsKey(indexChar)) {
                // 字符出现过，且在头尾之间，获取出现过的位置
                int tempIndex = existedChars.get(indexChar);
                if (tempIndex >= head) {
                    // 从新定位头指针
                    head = tempIndex + 1;
                }
                // 从新定位头部，计算最大长度
                maxLength = Math.max(currentLength, maxLength);
                // 重置字符长度
                currentLength = tail - head + 1;
            } else {
                // 最大长度增加
                currentLength++;
            }
            // 随时更新每个字符的最新位置
            existedChars.put(indexChar, tail);
        }
        return Math.max(currentLength, maxLength);
    }
}
