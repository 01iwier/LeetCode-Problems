/*
 * @lc app=leetcode id=495 lang=java
 *
 * [495] Teemo Attacking
 */

// @lc code=start
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int durationPoisoned = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            durationPoisoned += duration;
            if (i > 0) {
                int diff = timeSeries[i] - timeSeries[i-1];
                if (diff < duration) durationPoisoned -= (duration - diff);
            }
        }
        return durationPoisoned;
    }
}
// @lc code=end

