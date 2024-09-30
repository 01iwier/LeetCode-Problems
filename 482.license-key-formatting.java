/*
 * @lc app=leetcode id=482 lang=java
 *
 * [482] License Key Formatting
 */

// @lc code=start
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder str = new StringBuilder(s.replaceAll("-", ""));
        if (str.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        int x = str.length() % k;
        if (x == 0) {
            for (int i = 0; i < str.length(); i+=k) {
                res.append(str.substring(i, i+k));
                res.append("-");
            }
            res.deleteCharAt(res.length() - 1);
        } else {
            res.append(str.substring(0, x));
            res.append("-");
            for (int i = x; i < str.length(); i+=k) {
                res.append(str.substring(i, i+k));
                res.append("-");
            }
            res.deleteCharAt(res.length() - 1);
        }
        return res.toString().toUpperCase();
    }
}
// @lc code=end

