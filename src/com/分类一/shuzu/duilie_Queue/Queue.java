package com.分类一.shuzu.duilie_Queue;

public interface Queue<E> {

    //队列中添加一个元素
    void enqueue(E e);
    //队列中取出一个元素
    E dequeue();

    //看一下队首的元素是谁
    E getFront();

    int getSize();

    boolean isEmpty();




}
