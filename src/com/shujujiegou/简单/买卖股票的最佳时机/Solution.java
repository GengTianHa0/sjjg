package com.shujujiegou.简单.买卖股票的最佳时机;

public class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int max=0;


        for (int i=0;i<prices.length;i++){

            if (minprice>prices[i]){

                minprice=prices[i];

            }else if (prices[i]-minprice>max){
                max=prices[i]-minprice;
            }

        }


        return max;

    }
}
