/*
 * @lc app=leetcode id=89 lang=java
 *
 * [89] Gray Code
 */

// @lc code=start

import java.util.*;

class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);

        for (int i = 1; i <= n; i++) {
            List<Integer> rev = new ArrayList<>(result);
            Collections.reverse(rev);
            int val = (int)Math.pow(2, i-1);
            for (Integer x : rev) {
                result.add(x+val);
            }
        }

        return result;
    }
}
// @lc code=end

