package com.分类一.集合;

public interface Set<E> {


    void add(E e);


    void remove(E e);

    //判断是否包含某个元素
    boolean contains(E e);

    int getSize();

    boolean isEmpty();
}
