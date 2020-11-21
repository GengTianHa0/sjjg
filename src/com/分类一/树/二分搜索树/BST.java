package com.分类一.树.二分搜索树;

import com.sun.org.apache.bcel.internal.generic.NOP;
import com.sun.org.apache.regexp.internal.RE;

import java.util.Random;
import java.util.Stack;

//E extends Com
public class BST<E extends Comparable<E>> {
    private class Node {

        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }

    }

    public Node root;
    public int size;

    public void insert(E e) {
        root = add(root, e);
    }


    /**
     * 递归add
     *
     * @param node 结点
     * @param e    插入的元素
     */
    private Node add(Node node, E e) {

//        if (node == null) {
//            node = new Node(e);
//        }
//        if (e.equals(node.e)){
//            return;
//        }
//
//
//        if (e.compareTo(node.e) < 0 && node.left == null) {
//            node.left = new Node(e);
//            return;
//
//        }
//
//        if (e.compareTo(node.e) > 0 && node.right == null) {
//            node.right = new Node(e);
//            return;
//        }
//
//        if (e.compareTo(node.e) < 0) {
//            add(node.left, e);
//        } else {
//            add(node.right, e);
//        }

        if (node == null) {
            size ++;
            return new Node(e);

        }
        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }

        return node;
    }



    /**
     * 查找
     *
     * @param e
     * @return
     */
    // 看二分搜索树中是否包含元素e
    public boolean contains(E e){
        return contains(root, e);
    }

    // 看以node为根的二分搜索树中是否包含元素e, 递归算法
    private boolean contains(Node node, E e){

        if(node == null)
            return false;

        if(e.compareTo(node.e) == 0)
            return true;
        else if(e.compareTo(node.e) < 0)
            return contains(node.left, e);
        else // e.compareTo(node.e) > 0
            return contains(node.right, e);
    }

    /**
     * 前序遍历
     */
    public void preOrder() {


        preOrder(root);
    }

    private void preOrder(Node node) {

        if (node == null) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }


    /**
     * 前序非递归
     */
//    public void npreOrder() {
//        Node node = root;
//        System.out.println(node.e);
//
//        nodewhile(node);
//
//
//
//
//    }
//
//
//    public void nodewhile(Node node){
//        while (node != null) {
//            if (node.right != null) {
//                stack.push(node.right.e);
//            }
//            if (node.left != null) {
//                stack.push(node.left.e);
//            }
//
//            System.out.println(stack.peek());
//            stack.pop();
//            if (node.left!=null){
//                node = node.left;
//            }else {
//                while (!stack.isEmpty()) {
//                    System.out.println(stack.peek());
//                    stack.pop();
//                }
//                node=root.right;
//            }
//
//        }
//    }
    public void preOrderNR() {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.println(node.e);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    /**
     * 中序遍历
     */
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {

        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);

    }


    /**
     * 后序遍历
     */
    public void lsOrder() {
        lsOrder(root);
    }

    private void lsOrder(Node node) {

        if (node == null) {
            return;
        }
        lsOrder(node.left);
        lsOrder(node.right);
        System.out.println(node.e);
    }


    /**
     * 判断是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * 寻找二分搜索树的最小元素
     *
     * @return
     */
    public E minmum() {

        if (size == 0) {

            throw new IllegalArgumentException("BST is empty");
        }

        Node node = minmum(root);


        return node.e;


    }


    private Node minmum(Node node) {

        if (node.left == null) {
            return node;
        }
        node = minmum(node.left);
        return node;

    }


    /**
     * 寻找二分搜索树的最大元素
     */
    public E maxmum() {

        if (size == 0) {

            throw new IllegalArgumentException("BST is empty");
        }

        Node node = maxmum(root);


        return node.e;


    }

    private Node maxmum(Node root) {
        if (root.right
                == null) {
            return root;
        }
        root = maxmum(root.right);
        return root;

    }


    /**
     * 删除二分搜索树的最小值 并返回最小值
     *
     * 第一种方法
     */


//    public E removemixmum() {
//        //1.找到最小值的父亲
//
//        Node node = removemixmum(root);
//
//        if (node.left == null)
//            return node.e;
//
//        if (node.left.right != null)
//            node.left.right = node;
//
//
//        Node a = node.left;
//        node.left = null;
//        return a.e;
//
//    }
//
//    private Node removemixmum(Node root) {
//
//        if (root.left == null || root.left.left == null) {
//            size--;
//            return root;
//        }
//          return removemixmum(root.left);
//    }


    /**
     * 第二种方法
     */

    public E removeMin() {
        E ret = minmum();
        root = removeMin(root);
        return ret;
    }

    private Node removeMin(Node root) {

        if (root.left == null) {

            Node rightNode = root.right;

            root.right = null;

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
     * 删除二分搜索树的最大值 并返回最大值
     */


    public E removeMax() {
        E ret = maxmum();
        root = removeMax(root);
        return ret;
    }

    private Node removeMax(Node root) {

        if (root.right == null) {

            Node leftNode = root.left;

            root.left = null;

            return leftNode;

        }
        //返回删除结点后新的二分搜索树的根
        //此处root.left 代表删除结点 即root代表删除结点的父结点
        //重点是root=root.left
        root.right = removeMin(root.right);
        return root;
    }

    /**
     * 删除二分搜索树的任意值
     * <p>
     * 1.左/右没有根节点
     * 2.左右有根节点
     */

    public void remove(E e) {

        root = remove(root, e);

    }


    //删除以node为根的二分搜索树中值为e的节点，递归算法
    //返回删除节点后新的二分搜索树的根
    private Node remove(Node node, E e) {
        if (node == null) {
            return null;
        }

        if (e.compareTo(node.e) < 0) {
            node.left = remove(node.left, e);
            return node;
        } else if (e.compareTo(node.e) > 0) {
            node.right = remove(node.right, e);
            return node;
        } else {//e==node.e
            if (node.left == null) {
                Node rightNode = node.right;
                node.right = null;
                size--;
                return rightNode;

            }

            if (node.right == null) {
                Node leftNode = node.left;
                node.left = null;
                size--;
                return leftNode;
            }

            //待删除结点左右子树均不为空的情况
            //找到比待删除结点大的最小节点，即待删除结点右子树最小结点


            //右子树中最小的结点     还有一种方法是左子树左子树种最大的结点
            Node successor = (node.right);
            successor.right = removeMin(node.right);
            successor.left = node.left;
            node.left = node.right = null;
            return successor;


        }

    }



}
