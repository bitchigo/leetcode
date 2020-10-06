/*
 * @lc app=leetcode.cn id=896 lang=java
 *
 * [896] 单调数列
 */

// @lc code=start
class Solution {
    public boolean isMonotonic(int[] A) {
        int temp=0;
        for(int i=0;i<A.length-1;i++){
            int t=Integer.compare(A[i], A[i+1]);
            if(t!=0){
                if(temp!=0&&t!=temp){
                    return false;
                }
                temp=t;
            }
        }
        return true;
    }
}
// @lc code=end

