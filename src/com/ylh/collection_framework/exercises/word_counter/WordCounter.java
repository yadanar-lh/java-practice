package com.ylh.collection_framework.exercises.word_counter;

import java.util.HashMap;

public class WordCounter {
    //declare a hash map to store words
    HashMap<String, Integer> wordsCount = new HashMap<>();

    //Method
    public void countWord(String input){

        //Split words as array
        String[] inputArr = input.split(" ");

        for(String word : inputArr){
            wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
        }
        //print the whole hashmap
        System.out.println(wordsCount);
    }
}








