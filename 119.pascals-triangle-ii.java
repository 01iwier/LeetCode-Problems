/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start

import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        if (rowIndex == 0) return prev;

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                temp.add(prev.get(j-1) + prev.get(j));
            }
            temp.add(1);
            prev = temp;
        }

        return prev;
    }
}
// @lc code=end

