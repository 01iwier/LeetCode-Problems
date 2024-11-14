/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0, j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                i = Math.max(map.get(c), i);
            }
            maxLen = Math.max(maxLen, j - i + 1);
            map.put(c, j + 1);
        }

        return maxLen;
    }
}
// @lc code=end
// String memory = "";
        // int temp = 0;
        // int max = 0;
        // int n = s.length();
        // for (int i = 0; i < n; i++) {
        //     String current = String.valueOf(s.charAt(i));
        //     if (memory.contains(current)) {
        //         i -= temp;
        //         temp = 0;
        //         memory = "";
        //     } else {
        //         temp++;
        //         memory += current;
        //         if (temp > max) {max = temp;}
        //     }
        // }
        // return max;
