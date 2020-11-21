package com.分类一.优先队列与堆.优先队列;

import com.分类一.优先队列与堆.堆.MaxHeap;

public class PriorityQueue<E extends Comparable<E>> implements Queue<E>   {


    private MaxHeap<E> maxHeap;



    public PriorityQueue(){
        maxHeap=new MaxHeap<>();
    }


    @Override
    public int getSize() {
        return maxHeap.size();
    }

    @Override
    public boolean isEmpty() {
        return maxHeap.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        maxHeap.add(e);

    }

    @Override
    public E dequeue() {
        return maxHeap.extractMax();
    }

    @Override
    public E getFront() {
        return maxHeap.findMax();
    }
}
