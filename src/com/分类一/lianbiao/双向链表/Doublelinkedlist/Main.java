package com.分类一.lianbiao.双向链表.Doublelinkedlist;

public class Main {
    public static void main(String[] args) {
        DoubleList doubleList=new DoubleList();

        for (int i=0;i<10;i++){
            doubleList.insertFirst(i);
        }
        doubleList.displayForward();

        doubleList.insertAfter(2,9);
        doubleList.displayForward();
        doubleList.deletekey(2);
        doubleList.displayForward();
    }
}
