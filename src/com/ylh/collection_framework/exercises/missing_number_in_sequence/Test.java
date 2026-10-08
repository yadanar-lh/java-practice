package com.ylh.collection_framework.exercises.missing_number_in_sequence;

import java.util.ArrayList;
import java.util.List;

public class Test {
    static void main() {
        new MissingNumChecker().checkMissingNum(new ArrayList<>(List.of(1,2,3,4,5)));
        new MissingNumChecker().checkMissingNum(new ArrayList<>(List.of(2,3,7,5)));
        new MissingNumChecker().checkMissingNum(new ArrayList<>(List.of(1,2,3,4,5,6,10)));
    }
}
