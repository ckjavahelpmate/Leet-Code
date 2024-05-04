package com.easy;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 3,2,4} ;
       int[] res = twoSum( nums , 6 ) ;
        System.out.println(Arrays.toString(res));
    }

    public static  int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2] ;
        for( int i = 0 ; i < nums.length-1 ; i++ )
        {
            for (int j = i+1; j < nums.length ; j++)
            {
                if (nums[i]+nums[j] == target) {
                    sum[0] = i ;
                    sum[1] =j ;
                    return sum ;
                }
            }
        }
        return null ;
    }
}
