/*
 * @lc app=leetcode id=500 lang=java
 *
 * [500] Keyboard Row
 */

// @lc code=start
class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        String[] result = {};
        int idx = 0;

        for (String word : words) {
            int row = findRow(word.charAt(0), rows);
            boolean works = true;
            for (int i = 0; i < word.length(); i++) {
                if (!rows[row].contains(Character.toString(word.toLowerCase().charAt(i)))) {
                    works = false;
                    break;
                }
            }
            if (works) {
                result[idx] = word;
                idx++;
            }
        }

        return result;
    }

    public int findRow(char c, String[] rows) {
        for (int i = 0; i < rows.length; i++) {
            if (rows[i].contains(Character.toString(c).toLowerCase())) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

