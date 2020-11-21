package com.shujujiegou.中等.对链表进行插入排序;

public class Solution {
    public ListNode insertionSortList(ListNode head) {

        ListNode dummyHead=new ListNode(0);

        dummyHead.next=head;
        ListNode pre;

        while (head!=null&&head.next!=null){

            if (head.val<head.next.val){
                head=head.next;
                continue;
            }
            pre=dummyHead;

            while (pre.next.val<head.next.val){
                pre=pre.next;
            }

            ListNode curr=head.next;

            head.next=curr.next;

            curr.next=pre.next;

            pre.next=curr;

        }


        return dummyHead.next;


    }


}
