package com.ylh.exception_handling.exe2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static void main() throws NullPointerException {

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
        System.out.print("Enter first num ; ");
        try{
             num1 = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException ime){
            System.out.println(ime.getMessage());
        }

        System.out.print("Enter second num ; ");
        try{
             num2 = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException ime){
            System.out.println("Input MisMatch Exception Occurs");
        }

        try{
            int result = num1/num2;
            System.out.println(result);
        } catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }


    }
}


