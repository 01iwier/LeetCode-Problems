/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

// @lc code=start

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\s");
        HashMap<Character, String> map = new HashMap<>();
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c) && !map.get(c).equals(words[i])) {
                return false;
            } else if (!map.containsKey(c) && map.containsValue(words[i])) {
                return false;
            } else {
                map.put(c, words[i]);
            }
        }
        return true;
    }
}
// @lc code=end

