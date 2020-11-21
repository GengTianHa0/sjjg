package com.分类一.集合.基于二分搜索树的集合;

import com.分类一.树.二分搜索树.BST;
import com.分类一.集合.Set;

public class BSTSet<E extends Comparable<E>> implements Set<E> {

     private BST<E> bst;


    public BSTSet(){
        bst=new BST<>();
    }


    @Override
    public void add(E e) {
        bst.insert(e);

    }

    @Override
    public void remove(E e) {

        bst.remove(e);

    }

    @Override
    public boolean contains(E e) {
        return bst.contains(e);
    }

    @Override
    public int getSize() {
        return bst.size;
    }

    @Override
    public boolean isEmpty() {
        return bst.isEmpty();
    }
}
