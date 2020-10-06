/*
 * @lc app=leetcode.cn id=925 lang=java
 *
 * [925] 长按键入
 */

// @lc code=start
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char t=' ';
        int j;
        for (int i = 0; i < name.length(); i++) {
            for (j=0; j < typed.length(); j++) {
                if(typed.charAt(j)!=name.charAt(i)&&typed.charAt(j)!=t){
                    return false;
                }
            }
            if(j==typed.length()){
                return false;
            }
            t=name.charAt(i);
        }
        return true;
    }
}
// @lc code=end

