package com.分类一.lianbiao.单向链表.linkedListQueue;

import com.分类一.shuzu.duilie_Queue.Queue;


public class LinkedListQueue<T> implements Queue<T> {

    private class Node {

        private T e;
        private Node next;


        public Node(T e, Node next) {
            this.e = e;
            this.next = next;


        }

        public Node(T e) {
            this(e, null);
        }

        public Node() {

            this(null, null);

        }


        @Override
        public String toString() {
            return e.toString();
        }
    }


    private Node head, tail;
    private int size;


    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }


    //入队
    @Override
    public void enqueue(T t) {
        if (tail == null) {
            tail = new Node(t);
            head = tail;

        } else {
            tail.next = new Node(t);
            tail = tail.next;
        }
        size++;
    }

    //出队
    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue from an empty queue");
        }
        Node prev = head;


        head = head.next;
        prev.next = null;
        if (head == null) {
            tail = null;
        }
        size--;
        return prev.e;
    }

    @Override
    public T getFront() {
        return head.e;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node cur = head;
        while (cur != null) {
            builder.append(cur + "->");
            cur = cur.next;

        }
        builder.append("NULL");
        return builder.toString();
    }
}
