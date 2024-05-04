package com.easy;

import java.util.Arrays;

public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
       int[] nums = {0,0,1,1,1,2,2,3,3,4} ;

        System.out.println( removeDuplicates(nums) );
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if( nums.length == 0 )return  0 ;
        int k = 1 ;
        for (int i = 1; i < nums.length ; i++) {
            if( nums[i] != nums[k-1] )
            {
                    nums[k] = nums[i] ; k++ ;
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = -1 ;
        }
        return  k;
    }
}
