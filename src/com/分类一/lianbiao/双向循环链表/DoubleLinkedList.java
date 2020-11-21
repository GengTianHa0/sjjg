package com.分类一.lianbiao.双向循环链表;

public class DoubleLinkedList<T> {

    private int size = 0;
    private Link<T> beginMarker;
    private Link<T> endMarker;

    //创建一个空的双向循环链表
    public DoubleLinkedList(){

        beginMarker=new Link<T>();
        endMarker=new Link<T>();

        beginMarker.prev=endMarker;




        endMarker.next=beginMarker;



    }


}
