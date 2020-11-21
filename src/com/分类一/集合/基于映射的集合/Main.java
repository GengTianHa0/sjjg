package com.分类一.集合.基于映射的集合;

import com.分类一.集合.基于二分搜索树的集合.FileOperation;
import com.分类一.集合.基于链表的集合.LinkedListSet;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Pride and Prejudice");

          ArrayList<String> words1 = new ArrayList<>();
        if(FileOperation.readFile("pride-and-prejudice.txt", words1)) {
            System.out.println("Total words: " + words1.size());

           MapSet<String> linkedListSet=new MapSet<>();
            for (String word : words1)
                linkedListSet.add(word);
            System.out.println("Total different words: " + linkedListSet.getSize());
        }

        System.out.println();


        System.out.println("A Tale of Two Cities");

        ArrayList<String> words2 = new ArrayList<>();
        if(FileOperation.readFile("a-tale-of-two-cities.txt", words2)){
            System.out.println("Total words: " + words2.size());
            MapSet<String> set2 =new MapSet<>();
            for(String word: words2)
                set2.add(word);
            System.out.println("Total different words: " + set2.getSize());
        }
    }
}
