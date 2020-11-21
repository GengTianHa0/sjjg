package com.分类一.lianbiao.单向链表.linkedlist;

/**
 * 优点:真正的动态，不需要处理固定容量的问题
 * 缺点:丧失了随机访问的能力
 * 优点：只对链表头进行操作
 */

public class LinkedList<T> {


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


    private Node dummyhead;
    private int size;


    public LinkedList() {
        dummyhead = new Node();
        size = 0;
    }

    //todo  构造方法:传进来一个数组，把数组转换成链表

    //获取链表中的个数
    public int getSize() {
        return size;
    }


    /**
     * 通过找到前一个结点
     */
    public void add(int index, T e) {
        if (index < 0 || index > size) {

            throw new IllegalArgumentException("Add failed,Illegal index.");
        }

        Node prev = dummyhead;
        for (int i = 0; i < index; i++) {
            //index:因为有dummyhead，所以遍历到index前一个结点，
            //把prev节点存的下一个节点 存放到prev内
            prev = prev.next;
        }

//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;

        prev.next = new Node(e, prev.next);
        size++;


    }

    public void addFrist(T e) {
        add(0, e);
    }


    public void addLast(T e) {
        add(size, e);
    }


    //获得链表的第index(0-base)个位置的元素
    //在链表中不是常规操作 练习用
    public T get(int index) {
        if (index < 0 || index > size) {

            throw new IllegalArgumentException("Add failed,Illegal index.");
        }
        //我们要找到当前这个结点 cur = index  而不是要插入一个数据 要找到前一个结点
        Node cur = dummyhead.next;

        for (int i = 0; i < index; i++) {
            cur = cur.next;

        }
        return cur.e;

    }


    //获得链表的第一个元素
    public T getFrist() {
        return get(0);
    }

    //获得链表的最后一个元素
    public T getLast() {
        return get(size - 1);
    }

    //修改链表的index个位置的元素为e
    //在链表中不是一个常用的操作
    public void set(int index, T e) {

        if (index < 0 || index > size) {

            throw new IllegalArgumentException("Add failed,Illegal index.");
        }

        //我们要找到当前这个结点 cur = index  而不是要插入一个数据 要找到前一个结点
        Node cur = dummyhead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    //查找链表中是否有元素e
    public boolean contains(T e) {
        Node cur = dummyhead.next;
        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //查找链表中是否有元素
    public boolean isEmpty() {

        return size == 0;
    }


    //从链表中删除元素
    public T remove(int index) {
        if (index < 0 || index > size) {

            throw new IllegalArgumentException("Add failed,Illegal index.");
        }
        Node cur = dummyhead;

        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        Node delNode = cur.next;
        //更改是索引之间的更改
        cur.next = delNode.next;
        delNode.next = null;
        size--;
        return delNode.e;
    }

    //从链表中删除第一个元素返回删除的元素
    public T removeFrist() {
        return remove(0);
    }

    //从链表中删除最后一个元素
    public T removeLast() {
        return remove(size - 1);
    }


    public void remove(T e) {


    }

    public void removeAll(T e) {

    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
//        Node cur=dummyhead.next;

//        while (cur!=null){
//
//            res.append(cur+"->");
//            cur=cur.next;
//        }
        for (Node cur = dummyhead.next; cur != null; cur = cur.next) {
            res.append(cur + "->");
        }

        res.append("NULL");
        return res.toString();
    }
}
