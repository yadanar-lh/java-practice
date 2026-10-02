package com.ylh.collection_framework.set;

import java.util.HashSet;

public class HashSetExe {

    static void main() {

        HashSet<Integer> rooms = new HashSet<>();

        rooms.add(101);
        rooms.add(201);
        rooms.add(101);
        rooms.add(301);

        System.out.println("HASH SET [No duplication] : " + rooms);

        HashSet<Integer> rooms2 = (HashSet<Integer>) rooms.clone();
        System.out.println("CLONE HASH SET : " + rooms2);
    }
}
