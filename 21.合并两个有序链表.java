import java.util.List;

import org.w3c.dom.NodeList;

/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(); 
        ListNode t=res;
        while(true){
            if(l1==null){
                if(l2==null){
                  return res.next;
                }else{
                   t.next=new ListNode(l2.val);
                   t=t.next;
                   l2=l2.next;
                }
            }else{
                if(l2==null){
                    t.next=new ListNode(l1.val);
                    t=t.next;
                    l2=l2.next;
                }else{
                    if(l1.val<l2.val){
                        t.next=new ListNode(l1.val);
                        t=t.next;
                        l2=l2.next;
                    }else{
                        t.next=new ListNode(l2.val);
                        t=t.next;
                        l2=l2.next;
                    }
                }
            }
        }
        
    }
}
// @lc code=end

