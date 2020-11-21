package com.分类一.lianbiao.单向链表.linkedListQueue;


public class Main {
    public static void main(String[] args) {
        //测试栈
        LinkedListQueue<Integer> stack = new LinkedListQueue<>();
        for (int i = 0; i < 100; i++) {

            stack.enqueue(i);
            System.out.println(stack.toString());
            if (i % 3 == 2) {
                stack.dequeue();
                System.out.println(stack.toString());
            }
        }
    }
}
