package com.shujujiegou.简单.移除链表元素.递归求法;


public class Solution {
    public ListNode removeElements(ListNode head, int val, int depth) {
        String depthString = genrateDepthString(depth);
        System.out.println(depthString);
        System.out.println("Call:remove"+val+"in"+head);
        if (head == null) {
            System.out.println(depthString);
            System.out.println("Return:"+head);
            return null;
        }


        //先遍历到最后面 res为删除后剩余节点的个数
        ListNode res = removeElements(head.next, val, depth + 1);
        System.out.println(depthString);
        System.out.println("After remove"+val+": "+res);
        //如果相等就删除
        if (head.val == val) {
            return res;
        } else {
            //如果不相等就 就不删除
            head.next = res;
            return head;
        }
    }

    private String genrateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }

    public static void main(String[] args) {

    }


}
