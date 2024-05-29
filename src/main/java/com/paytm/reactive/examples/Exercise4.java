package com.paytm.reactive.examples;

import com.paytm.reactive.ReactiveSources;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        // TODO: Write code here
        ReactiveSources.intNumberMono().subscribe(num -> System.out.println(num));

        // Get the value from the Mono into an integer variable
        // TODO: Write code here
        int value = ReactiveSources.intNumberMono().block();
        System.out.println(value);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
