/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
import java.util.*;;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            boolean found = false;
            for (int j = 0; j < result.size(); j++) {
                String temp = result.get(j).get(0);
                if (isAnagram(strs[i], temp)) {
                    result.get(j).add(strs[i]);
                    found = true;
                    break;
                }
            }
            if (found == false || result.isEmpty()) {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                result.add(temp);
            }
        }
        return result;
    }

    private boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] countA = new int[26];
        int[] countB = new int[26];
        for (int i = 0; i < a.length(); i++) {
            countA[a.charAt(i) - 'a']++;
            countB[b.charAt(i) - 'a']++;
        }
        if (!Arrays.equals(countA, countB)) return false;
        return true;
    }
}
// @lc code=end

