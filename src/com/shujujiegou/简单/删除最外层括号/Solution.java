package com.shujujiegou.简单.删除最外层括号;

public class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder builder=new StringBuilder();
        int num=0;

        for(char c:S.toCharArray()){

            if(c=='(') ++num;



            if(num>1){
                builder.append(c);
            }


            if(c==')'){
                --num;
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String s="(()())(())";
        System.out.println( solution.removeOuterParentheses(s));

    }
}
