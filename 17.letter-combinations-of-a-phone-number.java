/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();
        List<String> res = new ArrayList<>();
        String[] map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        findcombo("", digits, map, res);
        return res;
    }

    public void findcombo(String combo, String nextDigits, String[] letterMap, List<String> result) {
        if (nextDigits.isEmpty()) {
            result.add(combo);
        } else {
            String letters = letterMap[nextDigits.charAt(0) - '2'];
            for (char c : letters.toCharArray()) {
                findcombo(combo + c, nextDigits.substring(1), letterMap, result);
            }
        }
    }
}
// @lc code=end

