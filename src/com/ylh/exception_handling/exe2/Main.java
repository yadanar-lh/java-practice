package com.ylh.exception_handling.exe2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static void main() {

        String student = null;
//        System.out.println(student.length());
        try{
            System.out.println(student.length());
        } catch (NullPointerException e ){
            System.out.println(e.getMessage());
        }

        safeDivide();
    }

    static Scanner scanner = new Scanner(System.in);

    public static void safeDivide(){
        int num1 = 0;
        int num2 = 0;
        boolean isValidInput = false;

        while(!isValidInput){
            System.out.print("Enter first num ; ");
            try{
                num1 = scanner.nextInt();
                isValidInput = true;

            } catch (InputMismatchException ime){
                System.out.println("Pls enter the whole number.");
                scanner.nextLine();
            }
        }

        isValidInput = false;
        while(!isValidInput){
            System.out.print("Enter second num ; ");
            try{
                num2 = scanner.nextInt();
                isValidInput = true;

            } catch (InputMismatchException ime){
                System.out.println("Pls enter the whole number.");
                scanner.nextLine();
            }
        }

        if(isValidInput){
            try{
                int result = num1/num2;
                System.out.println(result);
            } catch (ArithmeticException ae){
                System.out.println("Cannot divided by zero.");
            }
        }



    }
}


