package com.分类一.集合.基于链表的集合;

import com.分类一.集合.Set;
import com.分类一.集合.基于二分搜索树的集合.BSTSet;
import com.分类一.集合.基于二分搜索树的集合.FileOperation;

import java.io.File;
import java.util.ArrayList;

public class Main2 {


    private static double TestSet(Set<String> set,String filename){

        long startTime=System.nanoTime();

        ArrayList<String> words=new ArrayList<>();

        if (FileOperation.readFile(filename,words)){

            System.out.println("Total words: "+words.size());
        }
            for (String word:words){
                set.add(word);

            }

        System.out.println("Total different words"+set.getSize());


        long endTime=System.nanoTime();

        return (endTime-startTime)/1000000000.0;


    }


    public static void main(String[] args) {


        System.out.println(TestSet(new BSTSet<>(),"pride-and-prejudice.txt"));


        System.out.println(TestSet(new LinkedListSet<>(),"pride-and-prejudice.txt"));


    }
}
