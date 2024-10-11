/*
 * @lc app=leetcode id=500 lang=java
 *
 * [500] Keyboard Row
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        String[] rowStrings = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> result = new ArrayList<>();
        int idx = 0;

        for (String word: words) {
            int selectedRow = 0;
            word = word.toLowerCase();
            String c = Character.toString(word.charAt(0));
            for (int i = 0; i < rowStrings.length; i++) {
                if (rowStrings[i].contains(c)) {
                    selectedRow = i;
                    break;
                } 
            }

            boolean flag = true;

            for (int i = 0; i < word.length(); i++) {
                c = Character.toString(word.charAt(i));
                if (!rowStrings[selectedRow].contains(c)) {
                    flag = false;
                }
            }

            if (flag) {
                result.add(words[idx]);
            }
            idx++;
        }
        return result.toArray(new String[0]);
    }
}
// @lc code=end

