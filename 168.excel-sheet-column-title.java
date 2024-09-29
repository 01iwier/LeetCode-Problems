/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder columnText = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            columnText.append((char)(remainder + 'A'));
            columnNumber /= 26;
        }
        return columnText.reverse().toString();
    }
}
// @lc code=end

