package com.shujujiegou.中等.用最少数量的箭引爆气球;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int findMinArrowShots(int[][] points) {
//按照升序进行排列
//        Arrays.sort(points, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
////                if (o1[0]==o2[0])
////                    return o1[1] -o2[1];
////
////                return o1[0]-o2[0];
//                return o1[0]<o2[0]
//            }
//        });

        if (points.length==0){
            return  0;
        }

        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] point1, int[] point2) {
                if (point1[1] > point2[1]) {
                    return 1;
                } else if (point1[1] < point2[1]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });



        int temp=points[0][1];
        int count=1;

        for (int i=1;i<points.length;i++){

            if (temp<points[i][0]){
                count++;


                temp=points[i][1];
            }
        }


        return count;



    }


    public static void main(String[] args) {
        int[][] intervals = { { 1, 2 }, { 2, 3}, { 6, 7 }, { 8, 9 },  };


        System.out.println(new Solution().findMinArrowShots(intervals));
    }
}
