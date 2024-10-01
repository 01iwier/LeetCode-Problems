/*
 * @lc app=leetcode id=492 lang=java
 *
 * [492] Construct the Rectangle
 */

// @lc code=start
class Solution {
    public int[] constructRectangle(int area) {
        int x = (int)Math.sqrt(area);
        int length = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = area; i >= x; i--) {
            int temp = (i-area/i);
            if (area % i == 0 && temp >= 0 && temp < diff) {
                length = i;
                diff = i-area/i;
            }
        }
        return new int[] {length, area/length};
    }
}
// @lc code=end

