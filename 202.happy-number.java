/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {

        while (n != 1) {
            String s = Integer.toString(n);
            n = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                n += Math.pow(Integer.parseInt(Character.toString(c)), 2);
            }

            if (s.length() == 1 && !s.equals("7")) {
                return false;
            }
        }

        return true;
    }
}
// @lc code=end

