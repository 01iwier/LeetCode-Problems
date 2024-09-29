/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sc = s.toCharArray();
        char[] st = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(st);
        return Arrays.equals(sc, st);
    }
}
// @lc code=end

