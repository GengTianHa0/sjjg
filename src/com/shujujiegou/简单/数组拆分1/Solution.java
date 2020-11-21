package com.shujujiegou.简单.数组拆分1;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Solution {
    public static int arrayPairSum(int[] nums) {

        //两个最大的放一组 拿出较小的一个  每组都是

//        int a = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = i + 1; j < nums.length; j++) {
//
//                if (nums[i] > nums[j]) {
//                    a = nums[j];
//                    nums[j] = nums[i];
//                    nums[i] = a;
//                }
//            }
//
//        }
        Arrays.sort(nums);

        int result=0;
        for (int i=0;i<nums.length;i+=2){


                result=result+nums[i];

        }

        return result;
    }


    public static void main(String[] args) {

        int[] nums={6,2,6,5,1,2};

//        System.out.println( new Solution().arrayPairSum(nums));
        System.out.println(Solution.arrayPairSum(nums));

    }





}
