/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

// @lc code=start
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> returnStrings = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];

            while (i+1 < nums.length && nums[i] + 1 == nums[i+1]) {
                i++;
            }
            
            if (start != nums[i]) {
                returnStrings.add("" + start + "->" + nums[i]);
            } else {
                returnStrings.add("" + start);
            }
            
        }

        return returnStrings;
    }
}
// @lc code=end

