/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        int arr[][] = new int[m][n];
        return dest(arr,m,n,0,0);
    }
    
    static int dest(int arr[][],int m, int n, int i, int j){
        if(i>=m || j>=n)
            return 0;
        if(i==m-1 && j==n-1)
            return 1;
        if(arr[i][j]>0)
            return arr[i][j];
        return arr[i][j] = dest(arr,m,n,i+1,j) + dest(arr,m,n,i,j+1);
    }
}
// @lc code=end

