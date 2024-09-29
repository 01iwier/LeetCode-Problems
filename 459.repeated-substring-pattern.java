/*
 * @lc app=leetcode id=459 lang=java
 *
 * [459] Repeated Substring Pattern
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = s.length() / 2; i >= 1; i--) {
            if (s.length() % i == 0) {
                String temp = s.substring(0, i);
                StringBuilder str = new StringBuilder();
                for (int j = 0; j < s.length()/temp.length(); j++) {
                    str.append(temp);
                }
                if (str.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
// @lc code=end

