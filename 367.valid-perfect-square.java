/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 */



// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        long x = num;
        while (x*x > num) {
            x = (x + num/x) / 2;
        }
        return x*x == num;
    }
}
// @lc code=end

