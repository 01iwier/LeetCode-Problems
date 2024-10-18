/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            max = Math.max(sum, max);
            if(sum < 0) sum = 0;
        }
        return max;
    }
}
// @lc code=end

