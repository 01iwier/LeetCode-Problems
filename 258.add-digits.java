/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        String temp = Integer.toString(num);
        while (temp.length() > 1) {
            int total = 0;
            for (int i = 0; i < temp.length(); i++) {
                total += Integer.parseInt(temp.substring(i, i+1));
            }
            temp = Integer.toString(total);
        }
        return Integer.parseInt(temp);
    }
}
// @lc code=end

