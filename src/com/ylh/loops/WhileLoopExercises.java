package com.ylh.loops;

public class WhileLoopExercises {
    //1

    public static int countDigits(int n){
        int count = 0;

        if(n < 0){
            n = -n;
        }
        if(n == 0){
            count = 1;
        }
        while( n > 0){
            n /= 10;
            count ++;
        }
        return n;
    }

    //2
    public static int reverseNumber(int n){

        int reverse = 0;
        int res = 0;

        while (n != 0){
            res = n % 10;
            n /= 10;
            reverse = reverse * 10 + res;
        }
        return reverse;
    }

    //3
    public static int sumOfDigits(int n){
        int num = n;
        int res = 0;
        while(num != 0){
            res += num % 10;
            num /= 10;
        }
        return Math.abs(res);
    }

    //4
    public static boolean isPowerOfTwo(int n){
        if(n <= 0)
            return false;

        int power = 1;

        while (power <= n){
            if(power == n)
                return true;
            power *= 2;
        }
        return false;

    }

    //5
    public static int factorial(int n){
        int result = n;
        if(n < 0)
            return -1;
        if(n ==0){
            return 1;
        }
        while(n != 1){
            result = result * (n-1);
//        System.out.println(result);
//        System.out.println(n);
            n--;
//        System.out.println(n);
        }
        return result;
    }

    //6
    public static int smallestDivisor(int n){

        if(n <= 1)
            return -1;

        int divideDigit = 2;

        if(n % divideDigit == 0){
            return 2;
        }

        while (n % divideDigit != 0){
            divideDigit++;
        }
        return divideDigit;
    }

//7

    public static int digitAtPosition(int n, int position){
        int digit = 0;
        int increment = 0;
        if(position < 1){
            return -1;
        }

        while(increment != position){

            digit = n % 10;
            n /= 10;
            increment++;
        }
        return digit;
    }

//8

    public static boolean isPalindrome(int n){

        int reversedN = 0;
        int copyN = n;

        if(n < 0){
            return false;
        }

        while(copyN > 0){
            int modulusResult = copyN % 10;
            System.out.println(modulusResult);
            reversedN = reversedN * 10 + modulusResult;
            System.out.println(reversedN);
            copyN /= 10;
            System.out.println(copyN);

        }

        if(n == reversedN){
            return true;
        } else {
            return false;
        }

    }

    //9
    public static int accumulateUntil(int limit){
        if(limit <= 0){
            return 0;
        }

        int result = 0;
        int sum = 0;
        do{
            result += sum + 1;
            sum++;

        } while (result < limit);
        return result;
    }
}
