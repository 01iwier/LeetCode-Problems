/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> row = new HashSet<>();
        HashSet<Character> column = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            row.clear();
            column.clear();
            for (int j = 0; j < 9; j++) {
                if (row.contains(board[i][j]) || column.contains(board[j][i])) return false;
                if(Character.isDigit(board[i][j])) row.add(board[i][j]);
                if(Character.isDigit(board[j][i])) column.add(board[j][i]);
            }
        }
        // Check 3x3 subgrids
        for (int rowStart = 0; rowStart < 9; rowStart += 3) {
            for (int colStart = 0; colStart < 9; colStart += 3) {
            HashSet<Character> subgrid = new HashSet<>();
            for (int i = rowStart; i < rowStart + 3; i++) {
                for (int j = colStart; j < colStart + 3; j++) {
                if (subgrid.contains(board[i][j])) return false;
                if (Character.isDigit(board[i][j])) subgrid.add(board[i][j]);
                }
            }
            }
        }
        return true;
    }
}
// @lc code=end

