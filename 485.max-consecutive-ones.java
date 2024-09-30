/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int consecutive = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consecutive++;
            } else {
                max = Math.max(consecutive, max);
                consecutive = 0;
            }
        }
        max = Math.max(consecutive, max);
        return max;
    }
}
// @lc code=end

