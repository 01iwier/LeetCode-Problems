/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int reversed = 0;

        for (int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1;
            reversed |= (bit << (31 - i));
        }
        return reversed;
    }
}
// @lc code=end

