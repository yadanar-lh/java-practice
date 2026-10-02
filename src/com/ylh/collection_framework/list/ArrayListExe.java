package com.ylh.collection_framework.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExe {
    static void main() {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("List [INITIALIZATION]: " + numbers);

        numbers.remove(0);

        System.out.println("List [REMOVED INDEX 0]: " + numbers);

        numbers.addFirst(0);

        System.out.println("List [ADDED FIRST INDEX]: " + numbers);

        numbers.removeFirst();

        System.out.println("List [REMOVED FIRST INDEX]: " + numbers);

        List<Integer> reversedList = numbers.reversed();

        System.out.println("List [REVERSED LIST]: " + reversedList);

        numbers.removeAll(numbers);

        System.out.println("List [REMOVED ALL]: " + numbers);
    }
}
