package com.shujujiegou.中等.排序链表;

public class Solution {
    public ListNode sortList(ListNode head) {
        if (head==null){

            return head;
        }


        if (head.next==null){

            return head;
        }
        ListNode dummyhead = new ListNode(0);

        dummyhead.next = head;


        ListNode pre;




        while (head!=null&&head.next!=null){


            if (head.val<head.next.val){
                head=head.next;
                continue;
            }

            pre=dummyhead;

            while (pre.next.val<head.next.val){
                pre=pre.next;
            }


            ListNode cur=head.next;

            head.next=cur.next;



            cur.next=pre.next;
            pre.next=cur;


        }


        return dummyhead.next;

    }
}
