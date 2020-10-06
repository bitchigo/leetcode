import java.util.List;

/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode t=head;
        while(t!=null&&t.next!=null){
            if(t.next.val==t.val){
                t.next=t.next.next;
            }else{
                t=t.next;
            }
        }

        return head;
    }
}
// @lc code=end

