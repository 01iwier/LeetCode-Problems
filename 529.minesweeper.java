/*
 * @lc app=leetcode id=529 lang=java
 *
 * [529] Minesweeper
 */

// @lc code=start
class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }
        reveal(board, click[0], click[1]);
        return board;
    }

    private void reveal(char[][] board, int i, int j) {
        if (i < -0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'E') {
            return;
        }
        int mineCount = 0;
        int[][] surrounding = {{i-1,j-1}, {i-1,j}, {i-1,j+1}, 
                               {i,j-1},            {i,j+1}, 
                               {i+1,j-1}, {i+1,j}, {i+1,j+1}};
        for (int[] cell : surrounding) {
            if (cell[0] < -0 || cell[0] >= board.length || cell[1] < 0 || cell[1] >= board[0].length) continue;
            if (board[cell[0]][cell[1]] == 'M') {
                mineCount++;
            }
        }

        if (mineCount > 0) {
            board[i][j] = (char)('0' + mineCount);
            return;
        } else {
            board[i][j] = 'B';
            for (int[] cell : surrounding) {
                reveal(board, cell[0], cell[1]);
            }
        }
    }
}
// @lc code=end

