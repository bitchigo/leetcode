/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start

//横向扫描
// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         if(strs.length==0)
//             return "";
//         String res=strs[0];
//         for (int i = 1; i < strs.length; i++) {
//             int j=0;
//             for(;j<strs[i].length();j++){
//                 if(j<res.length()&&res.charAt(j)!=strs[i].charAt(j)){
//                     res=res.substring(0, j);
//                 }
//             }
//             if(j<res.length()){
//                 res=res.substring(0,j);
//             }
//         }
//         return res;
//     }
// }


//纵向扫描
class Solution{
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        StringBuffer sb=new StringBuffer();
        int l=strs[0].length();
        for (int i = 0; i < l; i++) {
            int j=0;
            for (; j < strs.length; j++) {
                if(strs[j].length()<=l){
                    l=strs[j].length();
                }
                if(i>=strs[j].length()&&strs[j].charAt(i)!=strs[0].charAt(i)){
                    return sb.toString();
                }
            }
            if(j==strs.length){
                sb.append(strs[0].charAt(i));
            }
        }
        return sb.toString();
    }
}


// @lc code=end





