package com.shujujiegou.简单.下一个更大元素I;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];


        for (int i = 0; i < nums1.length; i++) {
            result[i] = -1;


            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {

                    for (int k = j + 1; k < nums2.length; k++) {

                        if (nums2[k] > nums2[j]) {
                            result[i] = nums2[k];
                            break;
                        }

                    }

                }
            }


        }


        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        Solution solution = new Solution();
        int[] result = solution.nextGreaterElement(nums1, nums2);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
