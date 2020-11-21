package com.shujujiegou.简单.移除链表元素.无头节点;
public class Solution {
    public ListNode removeElements(ListNode head, int val) {


        //如果你头节点和给出的val相等，我们就删除头节点
        while (head!=null&&head.val==val){
            ListNode delNode=head;
            head=head.next;
            delNode.next=null;
        }
        if (head==null){
            return null;
        }

        ListNode prev=head;
        while (prev.next!=null){
            if (prev.next.val==val){
                ListNode delNode=prev.next;
                prev.next=delNode.next;
                delNode.next=null;
            }else {
                prev=prev.next;
            }
        }
        return head;

    }
}
