/*
 * @lc app=leetcode id=674 lang=java
 *
 * [674] Longest Continuous Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 1) return 1;
        int maxLength = 0;
        int currLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i-1]) {
                maxLength = Math.max(maxLength, currLength);
                currLength = 1;
            } else {
                currLength++;
            }
        }
        maxLength = Math.max(maxLength, currLength);
        return maxLength;
    }
}
// @lc code=end
