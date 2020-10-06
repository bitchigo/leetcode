/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag=true;
        for (int i = digits.length-1; i >=0; i--) {
            if(flag){
                digits[i]+=1;
            }
            if(digits[i]==10){
                digits[i]=0;
                flag=true;
            }else{
                flag=false;
                break;
            }
        }
        if(flag){
            int res[]= new int[digits.length+1];
            res[0]=1;
            return res;
        }
        return digits;
    }
}
// @lc code=end

