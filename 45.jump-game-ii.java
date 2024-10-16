/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int steps = 0, farthest = 0, endIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == endIndex) { steps++; endIndex = farthest;}
        }
        return steps;
    }
}
// @lc code=end

