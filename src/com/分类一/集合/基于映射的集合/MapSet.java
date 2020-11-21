package com.分类一.集合.基于映射的集合;

import com.分类一.映射.基于二叉树的映射.BSTMap;
import com.分类一.集合.Set;

public class MapSet<K extends Comparable<K>> implements Set<K> {
    private  V v=null;
    private BSTMap<K,V> mapSet;
    public MapSet(){

    mapSet=new BSTMap<>();

    }


    @Override
    public void add(K k) {

        mapSet.add(k,v);

    }

    @Override
    public void remove(K k) {
        mapSet.remove(k);

    }

    @Override
    public boolean contains(K k) {
        return mapSet.contains(k);
    }

    @Override
    public int getSize() {
        return mapSet.getSize();
    }

    @Override
    public boolean isEmpty() {
        return mapSet.getSize()==0;
    }
}
