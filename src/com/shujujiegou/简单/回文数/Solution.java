package com.shujujiegou.简单.回文数;

public class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) return false;


        int temp = x;
        int reverse = 0;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;

            temp=temp/10;
        }



        return x==reverse;


    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.isPalindrome(1321));

    }
}
