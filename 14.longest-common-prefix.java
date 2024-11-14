/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int prefixLen = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            while (prefixLen > s.length() || !prefix.equals(s.substring(0, prefixLen))) {
                prefixLen--;
                if (prefixLen == 0) {
                    return "";
                }
                prefix = prefix.substring(0, prefixLen);
            }
        }
        
        return prefix;
    }
}
// @lc code=end

