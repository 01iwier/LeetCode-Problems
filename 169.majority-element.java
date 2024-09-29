/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */
// import java.util.HashMap;
// import java.util.Map;
// @lc code=start

import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
// @lc code=end
// HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < nums.length; i++) {
        //     if (map.containsKey(nums[i])) {
        //         map.put(nums[i], map.get(nums[i]) + 1);
        //     } else {
        //         map.put(nums[i], 1);
        //     }
        // }

        // int max = Integer.MIN_VALUE;
        // int maxKey = 0;
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() > max) {
        //         max = entry.getValue();
        //         maxKey = entry.getKey();
        //     }
        // }

        // return maxKey;
