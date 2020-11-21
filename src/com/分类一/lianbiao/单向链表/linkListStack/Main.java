package com.分类一.lianbiao.单向链表.linkListStack;

public class Main {
    public static void main(String[] args){
        //测试栈
        LinkedListStack<Integer> stack=new LinkedListStack<>();

        for (int i=0;i<5;i++){
            stack.push(i);
        }
        System.out.println(stack.toString());


        stack.pop();
        System.out.println(stack.toString());

    }

}
