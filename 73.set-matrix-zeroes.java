/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> columnsToClear = new HashSet<>();
        Set<Integer> rowsToClear = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowsToClear.add(i);
                    columnsToClear.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (columnsToClear.contains(j) || rowsToClear.contains(i)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
// @lc code=end

