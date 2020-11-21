package com.分类一.lianbiao.单向链表.linkListStack;

import com.分类一.lianbiao.单向链表.linkedlist.LinkedList;
import com.分类一.shuzu.zhan.Stack;

public class LinkedListStack<T> implements Stack {
    LinkedList<T> linkedList;

    public LinkedListStack(){


        linkedList = new LinkedList<>();
    }




    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
      return linkedList.isEmpty();
    }

    @Override
    public void push(Object o) {
        linkedList.addFrist((T)o);

    }

    @Override
    public Object pop() {
        return linkedList.removeFrist();
    }


    //查看栈顶元素是谁
    @Override
    public Object peek() {
        return linkedList.getFrist() ;
    }


    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append("Stack:");
        builder.append(linkedList);

        return builder.toString();

    }
}
