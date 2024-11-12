/*
 * @lc app=leetcode id=682 lang=java
 *
 * [682] Baseball Game
 */

// @lc code=start
import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();
        for (String op : operations) {
            char c = op.charAt(0);
            if (c == 'C') {
                record.removeLast();
            } else if (c == 'D') {
                record.add(record.getLast() * 2);
            } else if (c == '+') {
                record.add(record.getLast() + record.get(record.size() - 2));
            } else {
                record.add(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (Integer temp : record) {
            sum += temp;
        }
        return sum;
    }
}
// @lc code=end