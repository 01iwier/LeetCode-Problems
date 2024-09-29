/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

// @lc code=start
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int x : nums) set.add(x);
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) list.add(i);   
        }
        return list;
    }
}
// @lc code=end

