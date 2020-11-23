package com.shujujiegou.简单.有效的字母异位词;

import java.util.Arrays;

public class Solution {

    public boolean isAnagram(String s, String t) {

       char[]  s1=  s.toCharArray();
       char[]  s2=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return  String.valueOf(s1).equals(String.valueOf(s2));

    }
}
