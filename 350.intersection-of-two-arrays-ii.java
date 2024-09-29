/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

// @lc code=start
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        if (nums1.length < nums2.length) {
            int[] temp = new int[0];
            temp = Arrays.copyOf(nums2, nums2.length);
            nums2 = nums1;
            nums1 = temp;
        }
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (list.contains(nums2[i])) {
                int x = list.indexOf(nums2[i]);
                list.remove(x);
                result.add(nums2[i]);
            }
        }

        int[] res = new int[result.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = result.removeFirst();
        }
        return res;
    }
}
// @lc code=end

