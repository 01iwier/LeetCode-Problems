/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
import java.util.HashSet;
import java.util.ArrayList;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                res.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }

        return arr;
    }
}
// @lc code=end

