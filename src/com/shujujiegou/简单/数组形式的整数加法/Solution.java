package com.shujujiegou.简单.数组形式的整数加法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public List<Integer> addToArrayForm(int[] A, int K) {

        List<Integer> list=new ArrayList<Integer>();
        int size=A.length;

        int temp=K;

        while (--size>=0||temp>0){

                if (size>=0){
                    temp=temp+A[size];
                }
                list.add(temp%10);
                temp=temp/10;

        }
        Collections.reverse(list);
        return list;




    }
    public static void main(String[] args) {
        int a[] = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};

        Solution a1 =new Solution();
        List<Integer> b= a1.addToArrayForm(a,806);
        for ( Integer s:b){
            System.out.println(s);
        }


    }

}
