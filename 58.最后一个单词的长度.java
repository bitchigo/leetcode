/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        int res=0;
        int start=0;
        int end=s.length()-1;
        boolean flag=true;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '&&flag){
                end=i;
                flag=false;
            }
            if(s.charAt(i)==' '){
                start=i;
            }
        }
        return end-start;
    }
}
// @lc code=end

