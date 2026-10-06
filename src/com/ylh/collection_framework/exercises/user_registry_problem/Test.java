package com.ylh.collection_framework.exercises.user_registry_problem;

public class Test {
    static void main() {
        UserRegistry userRegistry = new UserRegistry();

        userRegistry.registerUser("Yadanar");
        userRegistry.registerUser("Lin Htet");

        System.out.println(userRegistry.isUsernameTaken("Yadanar"));
        System.out.println(userRegistry.isUsernameTaken("Nanda"));
    }
}
