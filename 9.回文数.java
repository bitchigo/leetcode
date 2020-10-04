/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String str=Integer.toString(x);
        for(int i=0,j=str.length()-1;i<=j;i++,j--){
            if(!(str.charAt(i)==str.charAt(j))){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

