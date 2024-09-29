/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        if (s.length() == 1) {
            return romanMap.get(s.charAt(0));
        }

        int ans = 0;
    
        for (int i = 0; i < s.length() - 1; i++) {
            if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i+1))) {
                ans += romanMap.get(s.charAt(i));
            } else {
                ans -= romanMap.get(s.charAt(i));
            }
        }

        ans += romanMap.get(s.charAt(s.length() - 1));

    return ans;

    }
}
// @lc code=end

