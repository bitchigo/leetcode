/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,t=m-1;
        while(i<t+1&&j<n){
            if(nums1[i]>=nums2[j]){
                for (int x = t; x >=i; x--) {
                    nums1[x+1]=nums1[x];
                }
                t++;
                nums1[i]=nums2[j];
                j++;
            }
            i++;
        }
        while(j<n){
            nums1[t+++1]=nums2[j++];
        }
    }
}
// @lc code=end

