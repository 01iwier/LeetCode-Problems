/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            list.add(
                i % 15 == 0 ? "FizzBuzz" :
                i % 5 == 0 ? "Buzz" :
                i % 3 == 0 ? "Fizz" :
                String.valueOf(i)
            );
        }
        return list;
    }
}
// @lc code=end

