/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int curr = nums1[i];
            boolean found = false;
            int temp = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == curr) found = true;
                if (found && nums2[j] > curr) {
                    temp = nums2[j];
                    break;
                }
            }
            result[i] = temp;
        }
        return result;
    }
}
// @lc code=end

