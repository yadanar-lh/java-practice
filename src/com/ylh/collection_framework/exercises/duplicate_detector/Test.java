package com.ylh.collection_framework.exercises.duplicate_detector;

import java.util.List;

public class Test {
    static void main() {
        DuplicateDetector duplicateDetector = new DuplicateDetector();

        System.out.println(duplicateDetector.hasDuplicate(List.of("ylinn@mail.com", "ylinn234@mail.com")));
        System.out.println(duplicateDetector.hasDuplicate(List.of("ylinn@mail.com", "ylinn@mail.com")));

    }
}
