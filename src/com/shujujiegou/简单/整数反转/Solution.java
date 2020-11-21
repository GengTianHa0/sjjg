package com.shujujiegou.简单.整数反转;

public class Solution {
    public int reverse(int x) {

        long n=0;

        while (x!=0){
            n=n*10+x%10;
            x=x/10;
        }

        if ((int)n!=n){
            return 0;
        }

        return (int)n;
    }
}
