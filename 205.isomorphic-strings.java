/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            if (charMap.containsKey(si)) {
                if (!charMap.get(si).equals(ti)) {
                    return false;
                }
            } else {
                if (!charMap.containsValue(ti)) {
                    charMap.put(si, ti);
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
// @lc code=end

