package com.分类一.shuzu.zhan;

public interface Stack<E> {
    int getSize();


    boolean isEmpty();

    //添加元素
    void push(E e);

    //出元素
    E pop();



    //查看栈顶元素
    E peek();

}
