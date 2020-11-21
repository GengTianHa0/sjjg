package com.分类一.集合.基于链表的集合;

import com.分类一.lianbiao.单向链表.linkedlist.LinkedList;
import com.分类一.集合.Set;

public class LinkedListSet<E> implements Set<E> {

    private LinkedList<E> linkedList;


    public LinkedListSet() {
        linkedList = new LinkedList<E>();
    }

    @Override
    public void add(E e) {

        if (!linkedList.contains(e)){
            linkedList.addFrist(e);
        }


    }

    @Override
    public void remove(E e) {

        linkedList.remove(e);
    }

    @Override
    public boolean contains(E e) {
        return linkedList.contains(e);
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}
