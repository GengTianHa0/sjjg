package com.分类一.树.二分搜索树;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (Integer num : nums)
            bst.insert(num);


//        bst.preOrder();
//        System.out.println(" ");
//       bst.inOrder();
//        System.out.println(" ");
//       bst.lsOrder();
        bst.preOrderNR();
        System.out.println("  ");
//        System.out.println(bst.minmum());
//        System.out.println(bst.maxmum());
//        bst.removemixmum();
        bst.removeMin();
        bst.removeMax();

        bst.preOrderNR();


    }
}
