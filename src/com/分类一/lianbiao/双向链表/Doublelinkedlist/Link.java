package com.分类一.lianbiao.双向链表.Doublelinkedlist;

public class Link {
    public int data;
    public Link previous;
    public Link next;

    public Link(int data){
        this.data = data;
    }

    public void displayLink(){
        System.out.print(this.data + "  ");
    }

}

