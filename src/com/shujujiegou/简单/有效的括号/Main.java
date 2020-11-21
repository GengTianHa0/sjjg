package com.shujujiegou.简单.有效的括号;
public class Main {


    public static void main(String[] args) {
        String a="{}{}{}{}{}{(([[]]))]";
        Solution solution=new Solution();
        System.out.println(  solution.isValid(a));


    }
}
