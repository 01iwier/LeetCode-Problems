/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals("")) return true;
        int x = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(x) == t.charAt(i)) {
                x++;
                if (x == s.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
// @lc code=end

