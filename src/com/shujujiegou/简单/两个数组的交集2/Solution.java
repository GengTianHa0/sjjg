package com.shujujiegou.简单.两个数组的交集2;

import com.分类一.映射.基于链表的映射.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {


        //1.先遍历一遍nums1 如果重复的元素 value就加1

        //2. nums2和nums1中的值进行比较 如果有重复的就-1


        /*
        k v = 1 2
        kv =22
        kv=21
        kv=20
        if()



        kv=41
        kv=91
        kv=51

        kv=90
        kv=40
        kv=9 -1
        kv=4 -1

        去num1中找 4 和 9的值


         */


        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {

            if (treeMap.containsKey(nums1[i])) {
                treeMap.put(nums1[i], treeMap.get(nums1[i]) + 1);

            } else {
                treeMap.put(nums1[i], 1);
            }
        }


        for (int i=0;i<nums2.length;i++){

            if (treeMap.containsKey(nums2[i])){
                list.add(nums2[i]);
                treeMap.put(nums2[i], treeMap.get(nums2[i]) - 1);

                //返回的是最少的 再添加就添加不进去了
                if (treeMap.get(nums2[i])==0)
                    treeMap.remove(nums2[i]);
            }
        }



        int[] res=new int[list.size()];


        for (int i=0;i<res.length;i++){

            res[i]=list.get(i);
        }
        return res;


    }
}
