/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String res=strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j=0;
            for(;j<strs[i].length();j++){
                if(j<res.length()&&res.charAt(j)!=strs[i].charAt(j)){
                    res=res.substring(0, j);
                }
            }
            if(j<res.length()){
                res=res.substring(0,j);
            }
        }
        return res;
    }
}
// @lc code=end



