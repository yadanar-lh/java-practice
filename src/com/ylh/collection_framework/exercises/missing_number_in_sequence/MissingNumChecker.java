package com.ylh.collection_framework.exercises.missing_number_in_sequence;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class MissingNumChecker {

    //declare a hashset for uniqueness
    HashSet<Integer> checkedNum = new HashSet<>();
    ArrayList<Integer> missingNum = new ArrayList<>();
//    int[] ids = {1,2,3,4,5,6,7,8,9,10};

    //Method to check missing num
    public void checkMissingNum(ArrayList<Integer> numArray){

        //add to hashset first
       for(int num : numArray){
           if(!checkedNum.contains(num)){
               checkedNum.add(num);
           }
       }

       //add 1 to 10 to hashset, if a num does not contain, that's missing num
        for(int i = 1; i <= 10; i++){
            if(!checkedNum.contains(i)){
                missingNum.add(i);
            }
        }
        System.out.println("Missing Num");
       for(int num : missingNum){
           System.out.println("-> " + num);
       }
        System.out.println();
    }
}
