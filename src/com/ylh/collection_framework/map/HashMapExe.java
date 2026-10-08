package com.ylh.collection_framework.map;

import java.util.HashMap;

public class HashMapExe {
    static void main() {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Yadanar",20);
        scores.put("Shun Myat", 30);
        scores.put("Akari", 50);

        System.out.println(scores.get("Shun Myat"));

        System.out.println(scores.containsKey("Lin Htet"));
        System.out.println(scores.containsKey("Yadanar"));


        System.out.println(scores.getOrDefault("Lin Htet", 0));
    }
}
