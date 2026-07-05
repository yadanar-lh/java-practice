//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    int result = sumOfDigit(1234);
//    int result = countVowels("IU is a senior actress and k idol");
//    int result = factorial(3);
//    boolean result = IsPrime(33);
//     FizzBuzz(30);
//    boolean result = IsPowerOfTwo(4096);
//    int result = ReverseInteger(-897);
    int result = DigitFrequency("2223334566");
    System.out.println(result);


}

//1
public int sumOfDigit(int n){

    if(n < 0){
        return -1;
    }
    String num = String.valueOf(n);
    int sum = 0;
    for( char digits : num.toCharArray()){
        System.out.println(sum);
        sum += Character.getNumericValue(digits);
        System.out.println(digits);
    }
    return sum;
}

//2
public int countVowels(String str){

    /*
    Pseudocode
    ----------
    initialize count = 0;
    loop str , use enhance for char and charArray
    if a,e,i,o,u -> +1

     */

    str = str.toLowerCase();
    int count = 0;
    for(Character letter : str.toCharArray()){
        if(letter.equals('a') || letter.equals('e') ||letter.equals('i') ||letter.equals('o') || letter.equals('u') ){
            count++;
            System.out.println(letter);
        }
    }
    return count;
}

//3

public int factorial(int n){
    int result = 1;
    for(int i = n; i > 0; i--){
        result *= i;
    }
    return result;
}

//4
public boolean IsPrime(int n){
    boolean isPrime = true;
    if(n <= 1){
        return false;
    }

    if( n % 2 == 0 && n / 2 != 1){
        return false;
    }

    for(int i = 13; i > 1; i-=2){
        if(n % i == 0 && n / i != 1){
            isPrime = false;
        }
    }
    return isPrime;
}

//5
public void FizzBuzz(int n){
    for(int i = 1; i <= n; i++){

        if(i % 3 == 0 && i % 5 == 0){
            System.out.println("FizzBuzz");
        } else if(i % 3 == 0){
            System.out.println("Fizz");
        }else if(i % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }

    }
}

//6
public boolean IsPowerOfTwo(int n){
    boolean isPowerOfTwo = false;
    for(int i = 2; i <= n ; i*=2){
        if(i == n){
            isPowerOfTwo = true;
        }
    }
    return isPowerOfTwo;
}

//7
public int ReverseInteger(int n){
    int reversedInteger = 0;
    int integer = n;
    for(int i = integer; i != 0; i/=10 ){
        int temp = i % 10;
        reversedInteger = reversedInteger * 10 + temp;
    }
    return reversedInteger;
}

//8
// count digit frequency

/*
Pseudocode
=========
input = 223334444
output = 4
Process
1. make a blank array for count
2. add counts using enhance for loop
3. use loop to find which number has max frequent
4. use condition to make sure smallest number is output when tied

--------

Decomposition for frequent counting from array

example [0,1,1,2,3,8,6,1,8,1]
from back to front looping,
max number added to variable
if equal in comparing, choose front index
 */

public int DigitFrequency(String input){
    int frequentCount = 0;
    char[] digits = input.toCharArray();
    int[] countArray = new int[10];
    for(char c : digits){
        countArray[c - '0']++;
    }
    int maxCount = 0;
    for(int i = countArray.length -1; i >= 0; i--){
        if(countArray[i] >= maxCount){
            maxCount = countArray[i];
//            System.out.println("max count" + maxCount);
            frequentCount = i;
            // System.out.println(frequentCount);
        }
    }
    return frequentCount;
}

