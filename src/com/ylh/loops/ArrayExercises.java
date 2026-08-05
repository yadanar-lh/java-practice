package com.ylh.loops;

import java.util.Arrays;

public class ArrayExercises {
    public static int[] twoSum(int[] nums, int target){

        int[] output = new int[2];


        for(int i = 0; i < nums.length-1; i ++){
            for( int j =  i + 1; j < nums.length; j++){
                if(target == nums[i] + nums[j]){
                   output[0] = nums[i];
                   output[1] = nums[j];
                }
            }
        }
        return output;
    }
}
