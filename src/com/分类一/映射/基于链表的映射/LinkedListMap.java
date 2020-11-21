package com.分类一.映射.基于链表的映射;

import com.分类一.集合.基于二分搜索树的集合.FileOperation;

import java.time.temporal.ValueRange;
import java.util.ArrayList;

public class LinkedListMap<K, V> implements Map<K, V> {


    private class Node<K, V> {

        public K key;
        public V value;
        public Node next;

        public Node(K key, V value, Node next) {

            this.key = key;
            this.value = value;
            this.next = next;

        }


        public Node(K key) {

            this(key, null, null);

        }

        public Node() {
            this(null, null, null);
        }

        @Override
        public String toString() {
            return key.toString() + ":" + value.toString();
        }
    }


    private Node dummuHead;
    private int size;


    public LinkedListMap() {

        dummuHead = new Node();
        size = 0;

    }


    private Node getNode(K key) {

        Node cur = dummuHead.next;
        while (cur != null) {

            if (cur.key.equals(key)) {
                return cur;
            }
            cur = cur.next;

        }

        return null;


    }

    @Override
    public void add(K key, V value) {


        Node node = getNode(key);

        if (node == null) {
            dummuHead.next = new Node(key, value, dummuHead.next);
            size++;
        } else {
            node.value = value;
        }

    }


    @Override
    public V remove(K key) {

        //得到被删除的结点
    Node node= getNode(key);

    Node pre=dummuHead;

    while (!pre.next.key.equals(key)){
        pre=pre.next;
    }

    pre.next=node.next;
    node.next=null;
    size--;
    return (V) node.value;



    }

    //判断数据中是否有该key 如果有返回true
    @Override
    public boolean contains(K key) {
        return getNode(key) != null;
    }

    @Override
    public V get(K key) {

        Node node = getNode(key);

        return node == null ? null : (V) node.value;
    }

    @Override
    public void set(K key, V newValue) {

        Node node = getNode(key);
        if (node == null) {
            throw new IllegalArgumentException(key + "dosent't exist");
        }

        node.value = newValue;


    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }




    public static void main(String[] args) {
        System.out.println( "pride-and-prejudice");

        ArrayList<String> words=new ArrayList<>();
         if (FileOperation.readFile("pride-and-prejudice.txt",words)){
             System.out.println("Total words: "+words.size());
         }

         LinkedListMap<String ,Integer> linkedListMap=new LinkedListMap<>();

         for (String word:words){

            if (linkedListMap.contains(word)){
                linkedListMap.set(word,linkedListMap.get(word)+1);
            }else {

                linkedListMap.add(word,1);

            }
         }

         linkedListMap.remove("pride");


        System.out.println("Total different words:"+linkedListMap.getSize());
        System.out.println("Frequency of PRIDE: "+linkedListMap.get("pride"));





    }
}
