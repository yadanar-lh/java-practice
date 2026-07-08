package com.ylh.loops;

/*
Easy
1. Count Vowels in All Substrings
2. Sum of Digits in Range
3. Character Frequency Matrix
 */

import java.util.ArrayList;
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
}
