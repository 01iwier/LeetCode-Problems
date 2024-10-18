/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;
        
        int xStart = 0;
        int xEnd = matrix[0].length - 1;
        int yStart = 0;
        int yEnd = matrix.length - 1;

        while (yStart <= yEnd && xStart <= xEnd) {
            // Traverse from left to right
            for (int i = xStart; i <= xEnd; i++) {
                result.add(matrix[yStart][i]);
            }
            yStart++;

            // Traverse from top to bottom
            for (int i = yStart; i <= yEnd; i++) {
                result.add(matrix[i][xEnd]);
            }
            xEnd--;

            // Traverse from right to left, if valid
            if (yStart <= yEnd) {
                for (int i = xEnd; i >= xStart; i--) {
                    result.add(matrix[yEnd][i]);
                }
                yEnd--;
            }

            // Traverse from bottom to top, if valid
            if (xStart <= xEnd) {
                for (int i = yEnd; i >= yStart; i--) {
                    result.add(matrix[i][xStart]);
                }
                xStart++;
            }
        }

        return result;
    }
}

// @lc code=end