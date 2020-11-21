package com.shujujiegou.简单.两个数组的交集;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num1 : nums1)
            treeSet.add(num1);


        for (int i = 0; i < nums2.length; i++) {
            if (treeSet.contains(nums2[i])) {
                result.add(nums2[i]);
                treeSet.remove(nums2[i]);
            }
        }

        int[] res = new int[result.size()];

//        for (int r : res) {
//            res[r] = result.get(r);
//        }
        for (int i=0;i<res.length;i++){
            res[i]=result.get(i);
        }
        return res;


    }

    public static void main(String[] args) {

        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};


        Solution solution = new Solution();

        int[] res = solution.intersection(nums1, nums2);


        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }


        for (int a : res) {
            System.out.println(a);
        }


    }
}
