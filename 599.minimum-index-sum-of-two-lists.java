/*
 * @lc app=leetcode id=599 lang=java
 *
 * [599] Minimum Index Sum of Two Lists
 */

// @lc code=start

import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list2.length > list1.length) findRestaurant(list2, list1);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> result = new ArrayList<>();
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            Integer temp = map.get(list2[i]);
            if (temp != null) {
                if (temp + i < minIndex) {
                    result.clear();
                    result.add(list2[i]);
                    minIndex = temp + i;
                    continue;
                }
                if (temp + i == minIndex) {
                    result.add(list2[i]);
                }
            }
        }
        return result.toArray(new String[0]);
    }
}
// @lc code=end

