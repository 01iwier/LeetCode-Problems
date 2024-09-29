/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }
            n /= 4;
        }

        return true;
    }
}
// @lc code=end

