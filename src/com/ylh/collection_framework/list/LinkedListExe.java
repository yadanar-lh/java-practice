package com.ylh.collection_framework.list;

import java.util.LinkedList;

public class LinkedListExe {
    static void main() {
        LinkedList<String> alphabet = new LinkedList<>();
        
        alphabet.push("A");
        alphabet.push("B");
        alphabet.push("C");
        alphabet.push("D");
        alphabet.push("E");

        System.out.println("LINKED LIST : " + alphabet);
        
        alphabet.add(2,"C");
        System.out.println("ADDED C IN INDEX 2 : " + alphabet);
        
        alphabet.remove(2);
        System.out.println("REMOVED INDEX 2 : " + alphabet);
        
        int indexOf2 = alphabet.indexOf("C");
        System.out.println("INDEX OF 2 : " + indexOf2);
        
        String valueOfIndex2 = alphabet.get(2);
        System.out.println("VALUE OF INDEX 2 : " + valueOfIndex2);

        alphabet.pop();
        System.out.println("USED POP TO REMOVE [FILO] : " + alphabet);
        
        //Queue
        LinkedList<String> cities = new LinkedList<>();

        cities.offer("Yangon");
        cities.offer("Mandalay");
        cities.offer("Nay Pyi Taw");

        System.out.println("\nLINKED LIST : " + cities);

        String peekFirst = cities.peekFirst();
        System.out.println("PEEK FIRST : " + peekFirst);

        int indexOfNPT = cities.indexOf("Nay Pyi Taw");
        System.out.println("INDEX OF NPT : " + indexOfNPT);

        cities.add(2, "Pyay");
        System.out.println("ADDED INDEX 2 : " + cities);

        cities.remove(2);
        System.out.println("REMOVED INDEX 2 : " + cities);

        cities.poll();
        System.out.println("USED POLL TO REMOVE [FIFO] : " + cities);

        
    }
}
