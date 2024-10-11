/*
 * @lc app=leetcode id=506 lang=java
 *
 * [506] Relative Ranks
 */

// @lc code=start
import java.util.*;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sortedScore = Arrays.copyOf(score, score.length);
        Arrays.sort(sortedScore);

        for (int i = 0; i < sortedScore.length; i++) {
            map.put(sortedScore[i], sortedScore.length - i);
        }

        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            String temp = Integer.toString(map.get(score[i]));
            if (temp.equals("1")) {
                result[i] = "Gold Medal";
                continue;
            } else if (temp.equals("2")) {
                result[i] = "Silver Medal";
                continue;
            } else if (temp.equals("3")) {
                result[i] = "Bronze Medal";
                continue;
            } else {
                result[i] = temp;
            }
        }
        return result;
    }
}
// @lc code=end

