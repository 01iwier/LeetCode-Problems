/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Deque<Character> list = new ArrayDeque<>();
        for (int i = 0; i < magazine.length(); i++) {
            list.add(magazine.charAt(i));
        }
        for (Character c : ransomNote.toCharArray()) {
            if (!list.contains(c)) {
                return false;
            } else {
                list.removeFirstOccurrence(c);
            }
        }
        return true;
    }
}
// @lc code=end

