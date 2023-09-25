package com.xieajiu;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/multiply-strings/description/">43. 字符串相乘</a><br />
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。<br />
 * <b>注意：</b>不能使用任何内置的 BigInteger 库或直接将输入转换为整数。量。
 *
 */
public class Solution0043 {

    /**
     *
     * @param num1 数字一
     * @param num2 数字二
     * @return num1 * num2
     */
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int numInt1 = 0;
        int numInt2 = 0;
        int tempResult = 0;
        int[] result = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >=0; i--) {
            numInt1 = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                // 计算结果对应下表
                int index = i + j + 1;
                numInt2 = num2.charAt(j) - '0';
                tempResult = numInt1 * numInt2 + result[index];
                result[index] = tempResult % 10;
                result[index - 1] = tempResult / 10 + result[index - 1];
            }
        }
        StringBuilder resultStrBuilder = new StringBuilder();
        for (int i = result[0] == 0 ? 1 : 0; i < result.length; i++) {
            resultStrBuilder.append(result[i]);
        }
        return resultStrBuilder.toString();
    }
}
