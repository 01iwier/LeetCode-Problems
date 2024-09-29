/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        boolean isNegative = false;
        s = s.trim();
        
        if (s.isEmpty()) return 0;
        
        int i = 0;
        if (s.charAt(i) == '-') {
            isNegative = true;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        
        int result = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            
            result = result * 10 + digit;
            i++;
        }
        
        return isNegative ? -result : result;
    }
}
// @lc code=end

