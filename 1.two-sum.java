/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> x = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (x.containsKey(complement)) {
                return new int[] {x.get(complement), i};
            }
            x.put(nums[i], i);
        }

        return null;
    }
}
// @lc code=end

