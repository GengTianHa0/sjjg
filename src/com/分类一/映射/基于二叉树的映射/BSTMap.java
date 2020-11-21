package com.分类一.映射.基于二叉树的映射;

import com.分类一.映射.基于链表的映射.LinkedListMap;
import com.分类一.映射.基于链表的映射.Map;
import com.分类一.树.二分搜索树.BST;
import com.分类一.集合.基于二分搜索树的集合.FileOperation;

import java.util.ArrayList;

public class BSTMap<K extends Comparable<K>, V> implements Map<K, V> {


    private class Node {

        public K key;
        public V value;
        public Node left, right;


        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
        }

        @Override
        public String toString() {
            return "key:" + key.toString() + "value:" + value.toString();
        }


    }


    public Node root;
    public int size;


    public BSTMap() {
        root = null;
        size = 0;
    }


    @Override
    public void add(K key, V value) {

        root = add(root, key, value);

    }

    private Node add(Node node, K key, V value) {
        if (node == null) {
            size++;
            return new Node(key, value);
        }

        if (key.compareTo(node.key) < 0)
            node.left = add(node.left, key, value);
        else if (key.compareTo(node.key) > 0)
            node.right = add(node.right, key, value);
        else // key.compareTo(node.key) == 0
            node.value = value;

        return node;

    }

    @Override
    public V remove(K key){

        Node node = getNode(root, key);
        if(node != null){
            root = remove(root, key);
            return node.value;
        }
        return null;
    }

    //删除以node为根的二分搜索树中值为e的节点，递归算法
    //返回删除节点后新的二分搜索树的根
    private Node remove(Node node, K key){

        if( node == null )
            return null;

        if( key.compareTo(node.key) < 0 ){
            node.left = remove(node.left , key);
            return node;
        }
        else if(key.compareTo(node.key) > 0 ){
            node.right = remove(node.right, key);
            return node;
        }
        else{   // key.compareTo(node.key) == 0

            // 待删除节点左子树为空的情况
            if(node.left == null){
                Node rightNode = node.right;
                node.right = null;
                size --;
                return rightNode;
            }

            // 待删除节点右子树为空的情况
            if(node.right == null){
                Node leftNode = node.left;
                node.left = null;
                size --;
                return leftNode;
            }

            // 待删除节点左右子树均不为空的情况

            // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点
            // 用这个节点顶替待删除节点的位置
            Node successor = minmum(node.right);
            successor.right = removeMin(node.right);
            successor.left = node.left;

            node.left = node.right = null;

            return successor;
        }

    }


    public K removeMin() {
        K ret = minmum();
        root = removeMin(root);
        return ret;
    }

    private Node removeMin(Node root) {

        if (root.left == null) {

            Node rightNode = root.right;

            root.right = null;
            size --;
            return rightNode;

        }

        //返回删除结点后新的二分搜索树的根
        //此处root.left 代表删除结点 即root代表删除结点的父结点
        //重点是root=root.left
        // root.left代表删除的元素是什么，即递归左边代表要操作的元素
        root.left = removeMin(root.left);
        return root;
    }

    /**
     * 寻找二分搜索树的最小元素
     *
     * @return
     */
    public K minmum() {

        if (size == 0) {

            throw new IllegalArgumentException("BST is empty");
        }

        Node node = minmum(root);


        return node.key;


    }

    private Node minmum(Node node) {

        if (node.left == null) {
            return node;
        }
        node = minmum(node.left);
        return node;

    }


    //二叉树中是否包含key
    @Override
    public boolean contains(K key) {
//        return contains(root, key);
        return getNode(root, key) != null;
    }

//    private boolean contains(Node node, K e) {
//
//        if (node == null)
//            return false;
//
//        if (e.compareTo(node.key) == 0)
//            return true;
//        else if (e.compareTo(node.key) < 0)
//            return contains(node.left, e);
//        else // e.compareTo(node.e) > 0
//            return contains(node.right, e);
//
//
//    }


    private Node getNode(Node node, K key) {

        if (node == null)
            return null;

        if (key.equals(node.key))
            return node;
        else if (key.compareTo(node.key) < 0)
            return getNode(node.left, key);
        else // if(key.compareTo(node.key) > 0)
            return getNode(node.right, key);
    }


    @Override
    public V get(K key) {

        Node node = getNode(root, key);


        return node == null ? null : node.value;
    }

    @Override
    public void set(K key, V newValue) {
        Node node = getNode(root, key);
        if (node == null)
            throw new IllegalArgumentException(key + " doesn't exist!");

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
        System.out.println("pride-and-prejudice");

        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile("pride-and-prejudice.txt", words)) {
            System.out.println("Total words: " + words.size());
        }

        BSTMap<String, Integer> linkedListMap = new BSTMap<>();

        for (String word : words) {

            if (linkedListMap.contains(word)) {
                linkedListMap.set(word, linkedListMap.get(word) + 1);
            } else {

                linkedListMap.add(word, 1);

            }
        }
        System.out.println("Total different words:" + linkedListMap.getSize());
        System.out.println("Frequency of PRIDE: " + linkedListMap.get("pride"));
        linkedListMap.remove("pride");

        System.out.println("Frequency of PRIDE: " + linkedListMap.get("pride"));
        System.out.println("Frequency of PRIDE: " + linkedListMap.get("prejudice"));
        System.out.println("Total different words:" + linkedListMap.getSize());
    }


}
