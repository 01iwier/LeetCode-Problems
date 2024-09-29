/*
 * @lc app=leetcode id=405 lang=java
 *
 * [405] Convert a Number to Hexadecimal
 */

// @lc code=start
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        StringBuilder str = new StringBuilder();
        char[] conv = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        while (num != 0) {
            str.append(conv[num & 15]);
            num = num >>> 4;
        }
        return str.reverse().toString();
    }
}
// @lc code=end

