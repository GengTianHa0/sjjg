package com.分类一.优先队列与堆.堆;

//因为我们要比较元素 所以要继承与Comparable


public class MaxHeap<E extends Comparable<E>> {

    private Array<E> data;


    public MaxHeap(E capactity) {
        data = new Array<E>((Integer) capactity);
    }


    public MaxHeap() {
        data = new Array<>();
    }


    //将任意数组整理成堆的形状
    //1.找到最后一个非叶子结点的索引， 从后往前依次进行siftDown操作
    //怎么找到最后一个非叶子结点的索引呢？
    //找到最后一个结点的父亲结点 即最后一个非叶子结点

    //将n个元素逐个插入到一个空堆中 算法复杂度是O(nlogn)
    //heapify 算法复杂度为O(n)
    public MaxHeap(E[] arr){
        data=new Array<E>(arr);

        for (int i=parent(arr.length-1);i>=0;i--){
            siftDown(i);
        }
    }


    //返回堆中的元素个数
    public int size() {
        return data.getSize();
    }


    //返回一个布尔值 表示堆中是否为空
    public boolean isEmpty() {
        return data.isEmpty();
    }


    //返回完全二叉树的数组表示中 一个索引所表示的元素的父亲节点的索引
    private int parent(int index) {

        if (index == 0) throw new IllegalArgumentException("index-0 doesn't have parent. ");

        return (index - 1) / 2;

    }


    //返回完全二叉树的数组表示中 一个索引所表示的元素的左孩子节点的索引
    private int leftChild(int index) {


        return index * 2 + 1;
    }


    //返回完全二叉树的数组表示中 一个索引所表示的元素的右孩子节点的索引
    private int rightChild(int index) {


        return index * 2 + 2;
    }


    //向堆中添加元素
    public void add(E e) {

        data.addLast(e);

        siftUp(data.getSize() - 1);


    }

    private void siftUp(int k) {
        while(k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0 ){
            data.swap(k, parent(k));
            k = parent(k);
        }
    }

    public E findMax() {
        if (data.getSize() == 0) {
            throw new IllegalArgumentException("Can not findMAx when heap i");
        }

        return data.get(0);
    }


    //从堆中取出堆定元素
    public E extractMax() {

        E ret = findMax();
        data.swap(0, data.getSize() - 1);


        data.removeLast();


        //找到最小的
        siftDown(0);

        return ret;

    }

    private void siftDown(int k) {
        //然后进行下沉
        while (leftChild(k) < data.getSize()) {

            int j = leftChild(k);

            //判断左右孩子谁的比较大
            if (j + 1 < data.getSize() && data.get(j + 1).compareTo(data.get(j)) > 0) {
                j = j + 1;
            }


            if (data.get(k).compareTo(data.get(j)) >= 0) {

                break;

            }
            data.swap(k, j);
            k = j;


        }


    }

    //取出最大元素后 放入一个新元素

    //1.先rxtractMax 再add 两次O(logn)的操作

    //第二种：将堆定元素替换以后SiftDown 一个O(logn)的操作

    public E replace(E e) {
        E max = findMax();
        data.set(0, e);
        siftDown(0);
        return max;
    }






}
