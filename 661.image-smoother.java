/*
 * @lc app=leetcode id=661 lang=java
 *
 * [661] Image Smoother
 */

// @lc code=start
class Solution {
    public int[][] imageSmoother(int[][] img) {
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                System.out.println(img[i][j]);
            }
        }
        return img;
    }
}
// @lc code=end

/*
    for each cell in matrix find surrounding cells and calculate Math.floor(sum / cells)



 */