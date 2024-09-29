/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start

import java.util.HashSet;
import java.util.Stack;

class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        Stack stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
        }
        String st = "";
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                st += stack.pop();
            } else {
                st += s.charAt(i);
            }
        }
        return st;
    }
}
// @lc code=end

