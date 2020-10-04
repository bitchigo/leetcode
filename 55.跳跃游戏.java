/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int postion=0;
        for(int i=0;i<nums.length;i++){
            if(i<=postion){
                postion=Math.max(postion,i+nums[i]);
                if(postion>=nums.length-1){
                    return true;
                }
            }
        }
        return false;
    }
}
// @lc code=end

