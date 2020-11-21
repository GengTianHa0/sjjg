package com.shujujiegou.简单.比较含退格的字符串;

import java.util.Stack;

public class Solution {

    public boolean backspaceCompare(String S, String T) {
        S=result(S);
        T=result(T);


        return S.equals(T);
    }


    private static String result(String s ){


        Stack<String> stack=new Stack<>();

        for(int i=0;i<s.length();i++){

            String rs=s.charAt(i)+"";


            if(rs.equals("#")){
                if(!stack.isEmpty()){

                    stack.pop();

                }

            } else{
                stack.push(rs);
            }


        }

        return stack.toString();


    }

    public static void main(String[] args) {

        String S="a#c";
        String T="b";
        Solution solution=new Solution();
        System.out.println( solution.backspaceCompare(S,T));

    }
}
