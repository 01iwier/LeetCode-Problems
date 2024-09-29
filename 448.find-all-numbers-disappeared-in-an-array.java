/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

// @lc code=start
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] appeared = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            appeared[nums[i]]++;
        }
        for (int i = 1; i < appeared.length; i++) {
            if (appeared[i] == 0) list.add(i);
        }
        return list;
    }
}
// @lc code=end

