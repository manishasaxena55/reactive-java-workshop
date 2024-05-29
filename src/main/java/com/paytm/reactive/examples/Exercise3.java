package com.paytm.reactive.examples;

import com.paytm.reactive.ReactiveSources;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        // TODO: Write code here

        List<Integer> list = ReactiveSources.intNumbersFlux().toStream().toList();  //blocking behaviour: until the list is complete it can't end
        //  User user = ReactiveSources.userMono().block();

        System.out.println("List is:" + list);
        System.out.println("Size is:" + list.size());


/*        System.out.println("Press a key to end");
        System.in.read();*/
    }

}
