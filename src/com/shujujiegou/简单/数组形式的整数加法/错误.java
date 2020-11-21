package com.shujujiegou.简单.数组形式的整数加法;

import java.util.ArrayList;
import java.util.List;

public class 错误 {
    public List<Integer> addToArrayForm(int[] A, int K) {


        Long result=K+arraytoint(A);
        return   intToarray(result);




    }

    private Long arraytoint(int[] A){

        double result=0;


        for (int i=0;i<A.length;i++){
            result=result +A[i]*Math.pow(10,A.length-1-i);
        }



        return new Double(result).longValue();


    }


    private List<Integer> intToarray(Long K){

      String s= String.valueOf(K);

      List result=new ArrayList();

      for (int i=0;i<s.length();i++){

         result.add(Integer.parseInt(String.valueOf(s.charAt(i))));

      }
      return result;


    }


    public static void main(String[] args) {
        int a[] = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};

        错误 错误 =new 错误();
        List<Integer> b= 错误.addToArrayForm(a,806);
       for ( Integer s:b){
           System.out.println(s);
       }


    }
}
