

import com.ylh.loops.*;  // Imports ALL classes in the loops package

import java.util.Arrays;

import static com.ylh.loops.ForLoopExercises.DigitFrequency;
import static com.ylh.loops.NestedLoopExercises.*;
import static com.ylh.loops.ArrayExercises.*;

public class Main {
    public static void main(String[] args) {
        //    int result = sumOfDigit(1234);
//    int result = countVowels("IU is a senior actress and k idol");
//    int result = factorial(3);
//    boolean result = IsPrime(33);
//     FizzBuzz(30);
//    boolean result = IsPowerOfTwo(4096);
//    int result = ReverseInteger(-897);
//        int result = DigitFrequency("2223334566");
//        int result = countVowelsInAllSubstrings("yadanar");
//        int result = sumOfDigitsInRange(10,12);
//        characterFrequencyMatrix("aba");
//        int result = numOfPairsInString("cbaaba");
//        int result = countsOfPalindromesSubstring("aba");

        int[] result = twoSum(new int[]{2,7,11,15},9);
        System.out.println(Arrays.toString(result));

    }
}
