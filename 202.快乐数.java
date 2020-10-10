import java.util.Set;

/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<Integer>();
        while(n!=1&&!set.contains(n)){
            set.add(n);
            int s=0;
            for(int i=0;n>0;i++){
                s+=(n%10)*(n%10);
                n/=10;
            }
            n=s;
        }
        return n==1;
    }
}
// @lc code=end

