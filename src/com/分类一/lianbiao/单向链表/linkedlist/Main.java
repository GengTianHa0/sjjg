package com.分类一.lianbiao.单向链表.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();

        for (int i=0;i<5;i++){
            linkedList.addLast(i);
            System.out.println(linkedList);
        }

        linkedList.add(2,666);
        System.out.println(linkedList);

        System.out.println(linkedList.getSize());

        linkedList.addLast(888);
        System.out.println(linkedList);

        System.out.println(linkedList.get(1));


        System.out.println(linkedList.getFrist());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList.contains(888));

        linkedList.remove(0);
        System.out.println(linkedList);
        linkedList.removeFrist();
        linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println(linkedList.getSize());


    }

}
