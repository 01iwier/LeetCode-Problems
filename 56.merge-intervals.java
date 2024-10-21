/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> results = new ArrayList<>();
        int rangeStart = intervals[0][0], rangeEnd = intervals[0][1];
        
        for (int i = 1; i < intervals.length; i++) {
            if (rangeEnd >= intervals[i][0]) {
                rangeEnd = Math.max(rangeEnd, intervals[i][1]);
                rangeStart = Math.min(rangeStart, intervals[i][0]);
            } else {
                results.add(new int[]{rangeStart, rangeEnd});
                rangeStart = intervals[i][0];
                rangeEnd = intervals[i][1];
            }
        }
        results.add(new int[]{rangeStart, rangeEnd});

        return results.toArray(new int[results.size()][]);
    }
}
// @lc code=end

