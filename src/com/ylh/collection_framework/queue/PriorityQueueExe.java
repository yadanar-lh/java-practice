package com.ylh.collection_framework.queue;

import java.util.HashSet;
import java.util.PriorityQueue;

public class PriorityQueueExe {
    static void main() {
        PriorityQueue<String> fruits = new PriorityQueue<>();

        fruits.add("Papaya");
        fruits.add("Watermelon");
        fruits.add("Kiwi");
        fruits.add("Avocado");
        fruits.add("Dragon Fruit");
        fruits.add("Banana");
        fruits.add("Grape");

        System.out.println("PRIORITY QUEUE : " + fruits);

        fruits.removeIf(fruit -> fruit.startsWith("P"));
        System.out.println("REMOVED FRUIT WITH \'P\' : " + fruits);

        System.out.println("\n=== WITH POLL OUTPUT ===");
        while (!fruits.isEmpty()){
            System.out.println(fruits.poll());
        }
    }
}
