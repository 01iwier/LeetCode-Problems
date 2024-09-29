/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
        long times = 0;
        long longDivisor = Math.abs((long)divisor);
        long longDividend = Math.abs((long)dividend);
        boolean negative = (dividend < 0) ^ (divisor < 0);
        
        if (longDivisor == 1) {
            if (negative) longDividend *= -1;
            if (longDividend > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            return (int)longDividend;
        }

        while (longDividend >= longDivisor) {
            longDividend -= longDivisor;
            times++;
        }

        if (negative) times *= -1;

        if (times > Integer.MAX_VALUE) {
            times = Integer.MAX_VALUE;
        } else if (times < Integer.MIN_VALUE) {
            times = Integer.MIN_VALUE;
        }
        
        return (int)times;
    }
}
// @lc code=end

