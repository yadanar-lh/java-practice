package com.ylh.collection_framework.exercises.first_repeated_character;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedChar {

    //Declare a hashset for uniqueness
    Set<Character> checkedChar = new HashSet<>();

    //Method to Check if there is a repeated char, then output it.
    public void checkFirstRepeatedChar (String input){

        //Declare a variable to store the repeated char
        Character firstRepeatedChar = null;

        //Since input is String, change it into char array to use looping (enhanced for loop)
        char[] inputChar = input.toCharArray();

        //Loop
        for(char letter : inputChar){
            if(!checkedChar.contains(letter)){
                checkedChar.add(letter); //if no repetition, add to hashset
            } else {
                firstRepeatedChar = letter; //if repetition, add to variable and break the loop
                System.out.println(input + " : " + "\'" + firstRepeatedChar + "\'");
                break;
            }
        }

        if(firstRepeatedChar == null){ //no repetition, output 0
            System.out.println(input + " : " + "\'0\'");
        }
    }
}
