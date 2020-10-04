class Solution {
    public int maxProfit(int[] prices) {
        int i=0; //遍历
        int money=0; //获利
        int deep=prices[i];  //价格低谷
        int height=prices[i];  //价格高峰
        while(i<prices.length-1){
            while(i<prices.length-1&& prices[i]>=prices[i+1]){   //寻找低谷
                i++;
            }
            deep=prices[i];
            while(i<prices.length-1&& prices[i]<=prices[i+1]){   //寻找高峰
                i++;
            }
            height=prices[i];
            money+=height-deep;  //计算局部利润
        }
        return money;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int money=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                money+=prices[i+1]-prices[i];
            }
        }
        return money;
    }
}

