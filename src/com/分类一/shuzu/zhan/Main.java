package com.分类一.shuzu.zhan;

public class Main {
    public static void main(String[] args) {
        //测试栈
        ArrayStack<Integer> stack=new ArrayStack<>();

        for (int i=0;i<5;i++){
            stack.push(i);
        }
        System.out.println(stack.toString());

        stack.pop();
        System.out.println(stack.toString());
    }
}
