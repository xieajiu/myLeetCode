package com.xieajiu;

/**
 * <a href="https://leetcode.cn/problems/longest-common-prefix/description/" >14.最长公共前缀</a><br />
 * 编写一个函数来查找字符串数组中的最长公共前缀。<br />
 * 如果不存在公共前缀，返回空字符串 ""。<br />
 * 若只有一个字符串则输出当前字符串
 */
public class Solution0014 {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        String result = strs[0];
        for (int i = 0; i < strs.length; i++) {
            result = getTowStrLongestCommonPrefix(result, strs[i]);
            if (result.isEmpty()) {
                return result;
            }
        }
        return result;
    }

    /**
     * 寻找两个串的公共前缀
     * @param str1 字符串1
     * @param str2 字符串2
     * @return 公共前缀
     */
    private String getTowStrLongestCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < minLength && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return index == 0 ? "" : str1.substring(0, index);
    }
}
