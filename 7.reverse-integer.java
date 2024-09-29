/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int res = 0;
        boolean negative = x < 0;
        StringBuilder str = new StringBuilder(String.valueOf(Math.abs(x))).reverse();
        try {
            res = Integer.parseInt(str.toString());
        } catch (Exception e) {
            return 0;
        }
        return negative ? -res : res;
    }
}
// @lc code=end

