/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int p1 = 0, p2 = 0;
        int median = 0, median2 = 0;

        for (int i = 0; i <= (n + m) / 2; i++) {
            median2 = median;
            if (p1 < n && (p2 >= m || nums1[p1] < nums2[p2])) {
                median = nums1[p1];
                p1++;
            } else {
                median = nums2[p2];
                p2++;
            }
        }
        
        if ((n + m) % 2 == 0) {
            return ((double)median + (double)median2) / 2;
        } else {
            return (double)median;
        }

    }
}
// @lc code=end

