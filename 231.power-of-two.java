/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            if (n == Math.pow(2, i)) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

