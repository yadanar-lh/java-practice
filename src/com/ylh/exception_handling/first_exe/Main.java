package com.ylh.exception_handling.first_exe;

public class Main {
    static void main() {
        int i = 2;
        try{
            int result = i / 0;
        } catch (Exception e) {
            System.out.println("Cannot divided by 0");
        } finally{
            System.out.println("Finally Block");
        }
    }
}
