package com.分类二.递归.数组求和;

public class 数组求和 {


    //求arr(l..n)这个区间内所有数字的和

    public static int sum(int[] arr,int l){
        //因为index=arr.length-1 所以我们l==arr.length的时候截至
        if (l==arr.length){
            return 0;
        }

        return arr[l]+sum(arr,l+1);
    }

}
