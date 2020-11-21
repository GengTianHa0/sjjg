package com.分类一.shuzu.duilie_Queue;

public class Main {
    public static void main(String[] args) {
        //测试栈
        ArrayQueue<Integer> stack=new ArrayQueue<>();

        for (int i=0;i<10;i++){
            stack.enqueue(i);
            System.out.println(stack.toString());
            if (i%3==2){
                stack.dequeue();
                System.out.println(stack.toString());
            }
        }





    }
}
