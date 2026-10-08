package com.ylh.collection_framework.exercises.unique_word_checker;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueWordChecker {

    //Declare a hashset for uniqueness
     HashSet<String> checkedWord = new HashSet<>();


    //Method to check uniqueness, then output a repeated word
    public void checkUniqueWord(String input){
        //Split every word as a String array in order to loop
        String[] words = input.split(" ");
        String repeatedWord = null;

        //Loop
        for(String word : words){
            if(!checkedWord.contains(word)){
                checkedWord.add(word);
            } else {
                repeatedWord = word;
                System.out.println("Repeated Word : " + repeatedWord);
            }
        }

        if(repeatedWord == null){
            System.out.println("The Sentence is Unique 🎉.");
        }


    }

}
