/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int all=0,sub=0,start=0;
        for(int i=0;i<gas.length;i++){
            sub+=gas[i]-cost[i];
            all+=gas[i]-cost[i];
            if(sub<0){
                start=i+1;
                sub=0;
            }
        }
        return all>=0?start:-1;
    }
}
// @lc code=end

