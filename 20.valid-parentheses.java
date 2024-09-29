/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        if (s.length() == 1) {
            return false;
        }

        List<Character> open = List.of('{', '(', '[');
        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('(', ')');
        bracketMap.put('[', ']');
        bracketMap.put('{', '}');
        
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (open.contains(c)) {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    if (c != bracketMap.get(stack.pop())) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
        
    }
}
// @lc code=end

