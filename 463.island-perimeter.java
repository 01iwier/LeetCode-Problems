/*
 * @lc app=leetcode id=463 lang=java
 *
 * [463] Island Perimeter
 */

// @lc code=start
class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid.length == 1 && grid[0].length == 1) return 4;
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0) perimeter++;
                    if (i == grid.length-1) perimeter++;
                    if (j == 0) perimeter++;
                    if (j == grid[i].length-1) perimeter++;
                } else {
                    try { if (grid[i-1][j] == 1) perimeter++; } catch (Exception e) {}
                    try { if (grid[i+1][j] == 1) perimeter++; } catch (Exception e) {}
                    try { if (grid[i][j-1] == 1) perimeter++; } catch (Exception e) {}
                    try { if (grid[i][j+1] == 1) perimeter++; } catch (Exception e) {}
                }
            }
        }
        return perimeter;
    }
}
// @lc code=end

