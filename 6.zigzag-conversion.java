/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public String convert(String s, int numRows) {
        String[] rows = new String[numRows];
        Arrays.fill(rows, "");
        int idx = 0;
        while (idx < s.length()) {
            for (int i = 0; i < numRows && idx < s.length(); i++) {
                rows[i] += s.charAt(idx);
                idx++;
            }
            for (int i = numRows - 2; i > 0 && idx < s.length(); i--) {
                rows[i] += s.charAt(idx);
                idx++;
            }  
        }
        String result = "";
        for (int i = 0; i < numRows; i++) {
            result += rows[i];
        }
        return result;
    }
}
// @lc code=end

