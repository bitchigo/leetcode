/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int end=nums.length-1;
        for(int i=start;i<=end;i++){
            if(nums[i]==0){
                nums[i]=nums[start];
                nums[start]=0;
                start++;
            }else if(nums[i]==2){
                nums[i--]=nums[end];
                nums[end]=2;
                end--;
            }
        }
    }
}
// @lc code=end

