package com.分类一.优先队列与堆.堆;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        int n=10;
//        MaxHeap<Integer> maxHeap=new MaxHeap<>();
//
//        Random random=new Random();
//
//
//        for (int i=0;i<n;i++){
//            maxHeap.add(random.nextInt(Integer.MAX_VALUE));
//        }
//
//
//        int[] arr=new int[n];
//
//        for (int i=0;i<n;i++){
//            arr[i]=maxHeap.extractMax();
//
//        }
//
//
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }



        int n=10;

        Random random=new Random();

        Integer[] testData=new Integer[n];


        for(int i=0;i<n;i++){
            testData[i]=random.nextInt(Integer.MAX_VALUE);
        }


        for (Integer a:testData){
            System.out.println(a);
        }
        MaxHeap maxHeap=new MaxHeap<Integer>(testData);


        int[] arr=new int[maxHeap.size()];


        for (int i=0;i<arr.length;i++){

            arr[i]= (int) maxHeap.extractMax();
        }


        for (int s:arr){
            System.out.println(s);
        }

    }
}
