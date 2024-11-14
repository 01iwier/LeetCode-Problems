/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int water = 0;
        int start = 0;
        while (start < height.length - 1) {
            int end = start + 1;

            //find next equal or higher
            while (end < height.length - 1 && height[end] < height[start]) {
                end++;
            }

            //if no found tallest out of rest
            if (height[end] < height[start]) {
                if (start == height.length - 2) break;
                end = start + 1;
                int maxIndex = -1;
                int max = Integer.MIN_VALUE;
                while (end < height.length) {
                    if (height[end] > max) {
                        max = height[end];
                        maxIndex = end;
                    }
                    end++;
                }
                end = maxIndex;
            }

            //if found calculate water
            int totalArea = Math.min(height[start], height[end]) * (end - start - 1); //height * width between
            if (totalArea != 0) {
                for (int i = start + 1; i < end; i++) {
                    totalArea -= height[i];
                }
                water += totalArea;
            }

            start = end;
        }

        return water;
    }
}
// @lc code=end

