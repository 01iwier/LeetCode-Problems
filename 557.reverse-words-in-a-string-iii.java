/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String part : split) {
            StringBuilder x = new StringBuilder(part).reverse();
            result.append(x + " ");
        }
        return result.substring(0, result.length()-1);
    }
}
// @lc code=end

