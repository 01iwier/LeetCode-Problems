/*
 * @lc app=leetcode id=461 lang=java
 *
 * [461] Hamming Distance
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        StringBuilder longer = new StringBuilder(Integer.toBinaryString(Math.max(x, y)));
        StringBuilder shorter = new StringBuilder(Integer.toBinaryString(Math.min(x, y)));
        longer.reverse();
        shorter.reverse();
        int count = 0;
        for (int i = 0; i < shorter.length(); i++) {
            if (shorter.charAt(i) != longer.charAt(i)) count++;
        }
        for (int i = shorter.length(); i < longer.length(); i++) {
            if (longer.charAt(i) == '1') count++;
        }
        System.out.println(longer);
        System.out.println(shorter);

        return count;
    }
}
// @lc code=end

