/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

// @lc code=start
class Solution {
    public int hammingWeight(int n) {
        String bin = Integer.toBinaryString(n);
        int c = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                c++;
            }
        }
        return c;
    }
}
// @lc code=end

