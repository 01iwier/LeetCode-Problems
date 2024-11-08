/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 */

// @lc code=start
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        if (flowerbed.length == 1) return flowerbed[0] == 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (n == 0) return true;
            if (flowerbed[i] == 0) {
                if (i > 0 && i < flowerbed.length - 1) {
                    if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                    continue;
                }
                if (i == 0 && flowerbed[1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
                if (i == flowerbed.length - 1 && flowerbed[i-1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n == 0;
    }
}
// @lc code=end

