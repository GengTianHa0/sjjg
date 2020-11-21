package com.shujujiegou.简单.去掉最低工资和最高工资后的工资平均值;

public class Solution {
    public double average(int[] salary) {

        int max=salary[0];
        int min=salary[0];

        double total=0.0;
        for (int i=0;i<salary.length;i++){

            if (salary[i]>max){
                max=salary[i];
            }

            if (salary[i]<min){
                min=salary[i];
            }


            total=total+salary[i];

        }

        return (total-max-min)/(salary.length-2);

    }
}
