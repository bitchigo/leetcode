/*
 * @lc app=leetcode.cn id=714 lang=java
 *
 * [714] 买卖股票的最佳时机含手续费
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int money=0,have=-prices[0];
        for(int i=0;i<prices.length;i++){
            money=Math.max(money, have+prices[i]-fee);  //计算卖掉的收益
            have=Math.max(have, money-prices[i]);   //不卖掉的收益
        }
        return money;
    }
}
// @lc code=end

