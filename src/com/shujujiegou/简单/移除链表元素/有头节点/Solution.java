package com.shujujiegou.简单.移除链表元素.有头节点;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead=new ListNode(-1);
        dummyHead.next=head;

        ListNode prev=dummyHead;

        while (prev.next!=null){
            if (prev.next.val==val){
                ListNode delNode=prev.next;
                prev.next=delNode.next;
                delNode.next=null;
            }else {
                prev=prev.next;
            }
        }
        return dummyHead.next;
    }
}
