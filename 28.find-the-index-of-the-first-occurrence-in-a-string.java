/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        char c = needle.charAt(0);
        int l = needle.length();
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == c) {
                if (i+l <= haystack.length() && haystack.substring(i, i+l).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
// @lc code=end

