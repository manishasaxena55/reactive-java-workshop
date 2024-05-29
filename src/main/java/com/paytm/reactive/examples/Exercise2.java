package com.paytm.reactive.examples;

import com.paytm.reactive.ReactiveSources;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(e -> System.out.println(e));

        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here
        ReactiveSources.stringNumbersFlux().subscribe(e -> System.out.println(e));

        System.out.println("Press a key to end");
        System.in.read();
    }
}
