package com.分类一.lianbiao.双向循环链表;

public class Link<T> {
    T data;
    Link<T> next;
    Link<T> prev;


    public Link() {
        this.data = null;
        this.next = null;
        this.prev = null;
    }

    public Link(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;

    }

    public Link(T data, Link<T> next, Link<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;

    }

}
