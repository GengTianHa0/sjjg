package com.分类一.lianbiao.双向链表.Doublelinkedlist;

public class DoubleList {
    private Link first;
    private Link last;

    //判断链表是否为空
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * 从首部插入结点
     *
     * @param data
     */
    public void insertFirst(int data) {
        Link newNode = new Link(data);
        if (isEmpty()) {//当list为空时需要更新last
            last = newNode;
        } else {
            first.previous = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    /**
     * 从尾部插入
     */
    public void insertLast(int data) {
        Link newNode = new Link(data);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }


    /**
     * 将指定数据插入到指定结点后
     *
     * @param key  {指定结点的值}
     * @param data {待插入数据值}
     * @return boolean {成功插入返回true,否则返回false}
     */
    public boolean insertAfter(int key, int data) {
        Link newNode = new Link(data);
        Link current = first;
        while (current != null && current.data != key) {
            current = current.next;
        }
        if (current == null)
            return false;
        if (current == last) {
            last = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }
        newNode.previous = current;
        current.next = newNode;
        return true;
    }


    public void displayForward() {
        System.out.println("first-->last:");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        System.out.println("last-->first:");
        Link current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println();
    }


    public Link deletekey(int key) {
        Link current = first;

        while (current != null && current.data != key) {
            current = current.next;
        }

        if (current == null) {
            return null;
        }

        if (first == current) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }


        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }


}

