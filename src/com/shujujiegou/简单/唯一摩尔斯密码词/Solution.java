package com.shujujiegou.简单.唯一摩尔斯密码词;

import com.分类一.集合.基于二分搜索树的集合.BSTSet;

import java.util.TreeSet;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};

/**
 * word.charAt(i)-‘a‘
 * 获得当前字符所对应的索引，添加到StringBuilder容器。
 */

        TreeSet treeSet=new TreeSet();


        for (String word:words){

            StringBuilder res=new StringBuilder();


            for (int i=0;i<word.length();i++){
                res.append(codes[word.charAt(i)-'a']);
            }

            treeSet.add(res.toString());


        }


        return treeSet.size();



    }
}

