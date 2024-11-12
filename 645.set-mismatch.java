/*
 * @lc app=leetcode id=645 lang=java
 *
 * [645] Set Mismatch
 */

// @lc code=start

import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            map.put(i, 0);
        }

        for (int a : nums) {
            map.put(a, map.get(a) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                result[0] = entry.getKey();
            }
            if (entry.getValue() == 0) {
                result[1] = entry.getKey();
            }
        }
        return result;
    }
}
// @lc code=end

