package com.paytm.reactive.examples;

import com.paytm.reactive.StreamSources;

public class Exercise1 {

    public static void main(String[] args) {
        // Use StreamSources.intNumbersStream() and StreamSources.userStream()
        // Print all numbers in the intNumbersStream stream
        System.out.println("Print all numbers in the intNumbersStream stream");
        StreamSources.intNumbersStream().forEach(num -> System.out.println(num));

        // Print numbers from intNumbersStream that are less than 5
        System.out.println("Print numbers from intNumbersStream that are less than 5");
        StreamSources.intNumbersStream().filter(num -> num < 5).forEach(num -> System.out.println(num));
        // Print the second and third numbers in intNumbersStream that's greater than 5

        System.out.println("Print the second and third numbers in intNumbersStream that's greater than 5");
        StreamSources.intNumbersStream().filter(n -> n > 5).skip(1).limit(2).forEach(n -> System.out.println(n));

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        System.out.println("Print the first number in intNumbersStream that's greater than 5. or -1");
        int value = StreamSources.intNumbersStream().filter(n -> n > 5).findFirst().orElse(-1);
        System.out.println(value);

        // Print first names of all users in userStream
        System.out.println("Print first names of all users in userStream");
        StreamSources.userStream().map(user -> user.getFirstName()).forEach(user -> System.out.println(user));
        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        System.out.println("Print first names in userStream for users that have IDs from number stream");
        StreamSources.intNumbersStream().flatMap(id -> StreamSources.userStream().filter(user -> user.getId() == id))
                .forEach(user -> System.out.println(user.getFirstName()));
        System.out.println("Print first names in userStream for users that have IDs from number stream");
        StreamSources.userStream().filter(user -> (StreamSources.intNumbersStream().anyMatch(i -> i == user.getId())))
                .forEach(u -> System.out.println(u.getFirstName()));
    }
}
