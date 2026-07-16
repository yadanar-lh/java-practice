package com.ylh.loops;

/*
Easy
1. Count Vowels in All Substrings
2. Sum of Digits in Range
3. Character Frequency Matrix
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedLoopExercises {

    public static int countVowelsInAllSubstrings(String input){
        int count = 0;
        List<String> subStringArray = new ArrayList<>();

        for(int i = 1; i <= input.length(); i++){
            for(int j = 0; j <= input.length()-i;j++){
                int z = i + j;
                subStringArray.add(input.substring(j,z));
            }
        }
        for(String substrings : subStringArray){
            System.out.println(substrings);
            if(substrings.contains("a") || substrings.contains("e") ||
            substrings.contains("i") || substrings.contains("o") || substrings.contains("u")){
                count++;
            }
        }

        return count;
    }

    public static int sumOfDigitsInRange(int start, int end){
        int result = 0;
        int modulusNum = 0;
        List<Integer> arr = new ArrayList<>();

        for(int startNum = start; startNum <= end; startNum++){
            arr.add(startNum);
        }
        System.out.println(arr);
        for (int digits : arr){
            while(digits > 0 ){
                modulusNum += digits % 10;
                digits /= 10;
//                System.out.println("digits " +digits);
//                System.out.println("mod " +modulusNum);
            }
            result += modulusNum;
//            System.out.println("result " +result);
            modulusNum = 0;
        }

        return result;
    }

    public static void characterFrequencyMatrix(String input){
        List<String> arr = new ArrayList<>();
        int[] arrInt = new int[input.length()];
        for(int i = 0; i < input.length(); i++){
            for(int j = i + 1; j <= input.length(); j++){
                arr.add(input.substring(i,j));
                System.out.println(arr);
                if(arr.get(j-1).contains(input.substring(i,j))){
                    arrInt[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(arrInt));
    }
}
