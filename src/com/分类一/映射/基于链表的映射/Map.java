package com.分类一.映射.基于链表的映射;

public interface Map<K,V> {

    void add(K key, V value);

    V remove(K key);
    boolean contains(K key);

    V get(K key);


    void set(K key ,V newValue);

    int getSize();

    boolean isEmpty();
}
