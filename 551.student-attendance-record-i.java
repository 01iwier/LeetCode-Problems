/*
 * @lc app=leetcode id=551 lang=java
 *
 * [551] Student Attendance Record I
 */

// @lc code=start
class Solution {
    public boolean checkRecord(String s) {
        char[] record = s.toCharArray();
        int lateCount = 0;
        int absenceCount = 0;
        for (int i = 0; i < record.length; i++) {
            if (record[i] == 'P') {
                lateCount = 0;
            } else if (record[i] == 'L') {
                lateCount++;
                if (lateCount >= 3) return false;
            } else if (record[i] == 'A') {
                lateCount = 0;
                absenceCount++;
                if (absenceCount >= 2) return false;
            }
        }
        return true;
    }
}
// @lc code=end

