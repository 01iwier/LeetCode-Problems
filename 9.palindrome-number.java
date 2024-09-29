/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            String num = String.valueOf(x);
            int len = num.length();
            int lenHalf = num.length() / 2;
            for (int i = 0; i < lenHalf; i++) {
                if (num.charAt(i) != num.charAt(len - 1 - i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

