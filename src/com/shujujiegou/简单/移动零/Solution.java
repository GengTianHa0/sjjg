package com.shujujiegou.简单.移动零;

public class Solution {
    public void moveZeroes(int[] nums) {

        int temp=0;

        for (int i=0;i<nums.length;i++){

          for (int j=i+1;j<nums.length;j++){

              if (nums[i]==0){

                 temp= nums[j];
                 nums[j]=nums[i];
                 nums[i]=temp;
              }
          }

        }

    }


    public static void main(String[] args) {
        int[] a={0,1,0,3,12};

      Solution solution=new Solution();
      solution.moveZeroes(a);


      for (int b:a){
          System.out.print(b+" ");
      }
    }
}
