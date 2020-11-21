package com.分类一.shuzu.zhan;

import com.分类一.shuzu.shuzu.Array;

public class ArrayStack<E> implements Stack<E> {
    private Array<E> array;


    public ArrayStack(){
        array=new Array<>();
    }

    public ArrayStack(int capcity){
        array= (Array<E>) new Array<>(capcity);
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {

        array.addLast(e);

    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.get(array.getSize()-1);
    }


//数组的大小
    public int getCapacity(){
        return array.getSize();
    }




    @Override
    public String toString(){
        StringBuilder res=new StringBuilder();
        res.append("Stack:");
        res.append('[');
        for (int i=0;i<array.getSize();i++){
            res.append(array.get(i));
            if (i!=array.getSize()-1){
                res.append(", ");
            }
        }
        res.append("] top");

        return res.toString();
    }
}
