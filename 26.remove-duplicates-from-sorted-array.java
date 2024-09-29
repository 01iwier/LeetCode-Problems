/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int temp = Integer.MIN_VALUE;
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > temp) {
                temp = nums[i];
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
// @lc code=end

