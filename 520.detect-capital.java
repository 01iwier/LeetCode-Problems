/*
 * @lc app=leetcode id=520 lang=java
 *
 * [520] Detect Capital
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;
        char[] temp = word.toCharArray();
        boolean isUpper = Character.isUpperCase(word.charAt(0));
        boolean stayUpper = Character.isUpperCase(word.charAt(1));
        
        if (isUpper) {
            for (int i = 1; i < temp.length; i++) {
                if (Character.isLowerCase(temp[i])) {
                    if (stayUpper) {
                        return false;
                    }
                } else {
                    if (!stayUpper) {
                        return false;
                    }
                }
            }
        } else {
            for (int i = 0; i < temp.length; i++) {
                if (Character.isUpperCase(temp[i])) {
                    return false;
                }
            }
        }

        return true;
    }
}
// @lc code=end

