/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start
class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int len = columnTitle.length();

        for (int i = 0; i < len; i++) {
            char c = columnTitle.charAt(i);
            sum += (c - 64) * (Math.pow(26, len-i-1));
        }
        
        return sum;
    }
}
// @lc code=end

