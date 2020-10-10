/*
 * @lc app=leetcode.cn id=190 lang=java
 *
 * [190] 颠倒二进制位
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int t=n;
        int res=0;
        for (int i = 31; t!=0; i--) {
            if((t&1)==1){
                res+=1<<i;  //Math.pow有问题
            }
            t=t>>>1;
        }
        return res;
    }
}
// @lc code=end

