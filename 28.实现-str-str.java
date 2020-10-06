/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start


//超时
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i)==needle.charAt(0)){
                int j=0;
                for (; j < needle.length()&&i+j<haystack.length()&&haystack.charAt(i+j)==needle.charAt(j); j++) ;
                if(j==needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}
// @lc code=end
