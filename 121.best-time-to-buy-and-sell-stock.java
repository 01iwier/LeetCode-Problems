/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minCost = Math.min(minCost, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minCost);
        }

        return maxProfit;
    }
}
// @lc code=end

