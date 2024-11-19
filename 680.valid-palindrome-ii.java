/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        boolean skipAvailable = true;
        int left = 0, right = s.length()-1;
        while (left <= right) {
            System.out.println(s.charAt(left) + " " + s.charAt(right));
            if (s.charAt(left) != s.charAt(right)) {
                if (skipAvailable) {
                    skipAvailable = false;
                } else {
                    return false;
                }
            }
            left++;
            right--;
        }
        return true;
    }
}
// @lc code=end

