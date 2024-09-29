/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
import java.util.LinkedHashMap;
class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Boolean> map = new LinkedHashMap();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, false);
            } else {
                map.put(c, true);
            }
        }
        
        for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                return s.indexOf(entry.getKey());
            }
        }

        return -1;
    }
}
// @lc code=end

