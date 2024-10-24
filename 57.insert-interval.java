/*
 * @lc app=leetcode id=57 lang=java
 *
 * [57] Insert Interval
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[][] insert(int[][] original, int[] newInterval) {
        int[][] newIntervals = Arrays.copyOf(original, original.length + 1);
        newIntervals[original.length] = newInterval;
        Arrays.sort(newIntervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> results = new ArrayList<>();
        int rangeStart = newIntervals[0][0], rangeEnd = newIntervals[0][1];
        
        for (int i = 1; i < newIntervals.length; i++) {
            if (rangeEnd >= newIntervals[i][0]) {
                rangeEnd = Math.max(rangeEnd, newIntervals[i][1]);
                rangeStart = Math.min(rangeStart, newIntervals[i][0]);
            } else {
                results.add(new int[]{rangeStart, rangeEnd});
                rangeStart = newIntervals[i][0];
                rangeEnd = newIntervals[i][1];
            }
        }
        results.add(new int[]{rangeStart, rangeEnd});

        return results.toArray(new int[results.size()][]);
    }
}
// @lc code=end

