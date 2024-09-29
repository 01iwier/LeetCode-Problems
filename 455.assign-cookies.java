/*
 * @lc app=leetcode id=455 lang=java
 *
 * [455] Assign Cookies
 */

// @lc code=start
import java.util.Arrays;
class Solution {
    public int findContentChildren(int[] children, int[] cookies) {
        Arrays.sort(cookies);
        Arrays.sort(children);
        int content = 0;
        int j = 0;
        for (int i = 0; i < cookies.length; i++) {
            if (j == children.length) break;
            if (cookies[i] >= children[j]) {
                content++;
                j++;
            }
        }
        return content;
    }
}
// @lc code=end

