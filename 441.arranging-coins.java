/*
 * @lc app=leetcode id=441 lang=java
 *
 * [441] Arranging Coins
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        int rows = 1;
        while (n >= rows) {
            n -= rows;
            rows++;
        }
        return rows - 1;
    }
}
// @lc code=end

