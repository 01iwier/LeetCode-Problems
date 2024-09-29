/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int total = 0;
        int total2 = 0;
        for (int i = 0; i < nums.length; i++) {
            total += i;
            total2 += nums[i];
        }
        total += nums.length;
        System.out.println(Integer.toString(total) + " " + Integer.toString(total2));
        return total-total2;
    }
}
// @lc code=end

