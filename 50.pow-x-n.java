/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        long y = Long.parseLong(Double.toString(x).split(".")[0]);
        for (int i = 1; i < n; i++) {
            y *= Math.abs(y);
            System.out.println(y);
        }

        if (n < 0) {
            y = 1/y;
        }

        return Double.parseDouble(Long.toString(y));
    }
}
// @lc code=end

