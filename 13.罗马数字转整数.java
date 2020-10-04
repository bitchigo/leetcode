import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<Character,Integer>(){{
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        }};
        int res=0;
        int pre=map.get(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int j=map.get(s.charAt(i));
            if(j>pre){
                res-=pre;
            }else{
                res+=pre;
            }
            pre=j;
        }
        return res+pre;
    }
    
}
// @lc code=end

