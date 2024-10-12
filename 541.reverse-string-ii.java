/*
 * @lc app=leetcode id=541 lang=java
 *
 * [541] Reverse String II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        if (k >= s.length()) return new StringBuilder(s).reverse().toString();
        
        StringBuilder str = new StringBuilder();
        boolean flip = true;
        for (int i = 0; i < s.length(); i += k) {
            int x = i+k;
            if (x > s.length()) x = s.length();
            if (flip) {
                StringBuilder temp = new StringBuilder(s.substring(i, x)).reverse();
                str.append(temp);
                flip = false;
            } else {
                str.append(s.substring(i, x));
                flip = true;
            }
        }
        return str.toString();
    }
}
// @lc code=end

