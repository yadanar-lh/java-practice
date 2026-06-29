//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    int result = sumOfDigit(1234);
//    int result = countVowels("IU is a senior actress and k idol");
//    int result = factorial(3);
//    boolean result = IsPrime(33);
//     FizzBuzz(30);
//    boolean result = IsPowerOfTwo(4096);
    int result = ReverseInteger(-897);
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
declare count 0
compare num = 0
enhance for looping with char array
if index 0 == index 1, add to count, add index 0 to compare num
if index 0 > index 1, add index 1 to compare num
then continue comparing compare num with next indexes
 */

public int MostFrequentDigit(int n){
    int count = -1;
    int comparable;
    String num = String.valueOf(n);
    for(Character letter : num.toCharArray()){
        comparable = Character.getNumericValue(num.indexOf(0));
          if(comparable == Character.getNumericValue(letter)){
              count ++;
          } else if(Character.getNumericValue(num.indexOf(0)) > Character.getNumericValue(num.indexOf(1))) {
              comparable = Character.getNumericValue(letter);
        }
    }
    return count;
}