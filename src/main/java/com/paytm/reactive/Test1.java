package com.paytm.reactive;

import java.util.HashMap;

public class Test1 {
    /*    public static void main(String[] args) {
            List<String> result = new ArrayList<>();
            StreamSources.stringNumbersStream().parallel()
                    .filter(name -> name.length() == 3)
                    .map(String::toUpperCase)
                    .forEach(name -> result.add(name));

            System.out.println(result);
        }*/
    public static void main(String[] args) {

        // Create a HashMap and add some values
        HashMap<String, Integer> wordCount = new HashMap<>();
        wordCount.put("Geeks", null);
        wordCount.put("for", 2);
        wordCount.put("geeks", 3);

        // print HashMap details
        System.out.println("Hashmap before operation :\n "
                + wordCount);

        // provide new value for keys which is present
        // using computeIfPresent method
        wordCount.computeIfPresent("Geek",
                (key, val) -> val + 100);
        wordCount.computeIfPresent("geeks", (k, v) -> v + 10);

        // print new mapping
        System.out.println("HashMap after operation :\n "
                + wordCount);

    }
}