/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 * 
 */
// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        LinkedList<Character> list = new LinkedList();
        char c = 0;
        for (Character c1 : t.toCharArray()) c ^= c1;
        for (Character c2 : s.toCharArray()) c ^= c2;
        return c;
    }
}
// @lc code=end