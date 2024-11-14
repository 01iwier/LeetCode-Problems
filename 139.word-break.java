/*
 * @lc app=leetcode id=139 lang=java
 *
 * [139] Word Break
 */

// @lc code=start

import java.util.List;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            temp.append(s.charAt(i));
            System.out.println(temp);
            if (wordDict.contains(temp.toString())) {
                s = s.substring(i);
                temp = new StringBuilder();
                i = 0;
            }
        }
        if (temp.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
// @lc code=end

