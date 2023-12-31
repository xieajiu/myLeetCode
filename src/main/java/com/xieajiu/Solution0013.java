package com.xieajiu;

/**
 * <a href="https://leetcode.cn/problems/roman-to-integer/" >13.罗马数字转整数</a><br />
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。<br />
 *
 * 字符          数值<br />
 * I             1<br />
 * V             5<br />
 * X             10<br />
 * L             50<br />
 * C             100<br />
 * D             500<br />
 * M             1000<br />
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，即为 X + II 。 <br />
 * 27 写做  XXVII, 即为 XX + V + II 。<br />
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，<br />
 * 例如 4 不写做 IIII，而是 IV。<br />
 * 数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。<br />
 * 同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：<br />
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。<br />
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 <br />
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。<br />
 * 给定一个罗马数字，将其转换成整数。<br />
 */
public class Solution0013 {

    public int romanToInt(String s) {
        int sum = 0;
        int index = 0;
        for (; index < s.length() - 1; index++) {
            int first = getRomanIntValue(s.charAt(index));
            int second = getRomanIntValue(s.charAt(index + 1));
            if (second > first) {
                sum += (second - first);
                index++;
            } else {
                sum += first;
            }
        }
        sum += (index < s.length() ? getRomanIntValue(s.charAt(s.length() - 1)) : 0);
        return sum;
    }

    private int getRomanIntValue(char ch) {
        switch (ch) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;
        }
    }
}
