/*
 * @lc app=leetcode id=434 lang=java
 *
 * [434] Number of Segments in a String
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        if (s.equals("")) return 0;
        String[] result = s.split(" ");
        int x = result.length;
        for (int i = 0; i < result.length; i++) {
            if (result[i].isEmpty()) {
                x--;
            }
        }
        return x;
    }
}
// @lc code=end

