/*
 * @lc app=leetcode id=43 lang=java
 *
 * [43] Multiply Strings
 */

// @lc code=start
class Solution {
    public String multiply(String a, String b) {
        if (a.equals("0") || b.equals("0")) return "0";
        int m = a.length() - 1, n = b.length() - 1, carry = 0;
        StringBuilder product = new StringBuilder();
        for (int i = 0; i <= m + n || carry != 0; ++i) {
            for (int j = Math.max(0, i - n); j <= Math.min(i, m); ++j) {
                carry += (a.charAt(m - j) - '0') * (b.charAt(n - i + j) - '0');
            }
            product.append((char)(carry % 10 + '0'));
            carry /= 10;
        }
        return product.reverse().toString();
    }
}
// @lc code=end

