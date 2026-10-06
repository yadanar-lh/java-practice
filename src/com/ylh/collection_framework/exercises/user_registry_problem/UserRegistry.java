package com.ylh.collection_framework.exercises.user_registry_problem;

import java.util.HashSet;
import java.util.Set;

public class UserRegistry {

    private Set<String> takenUserNames = new HashSet<>();

    public boolean isUsernameTaken(String username){
        if(takenUserNames.contains(username)){
            return true;
        }
        return false;
    }

    public void registerUser(String username){
        takenUserNames.add(username);
    }
}
