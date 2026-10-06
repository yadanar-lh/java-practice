package com.ylh.collection_framework.exercises.duplicate_detector;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateDetector {


    public boolean hasDuplicate(List<String> emails) {
        Set<String> seen = new HashSet<>();
        for(String email : emails){
            if(seen.contains(email)){
                return true;
            }
            seen.add(email);

        }
        return false;
    }
}
