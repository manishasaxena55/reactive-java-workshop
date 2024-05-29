package com.paytm.reactive.examples;

import com.paytm.reactive.ReactiveSources;

import java.io.IOException;

public class Exercise7 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Print all values from intNumbersFlux that's greater than 5
        // TODO: Write code here
        //   ReactiveSources.intNumbersFlux().filter(e -> e > 5).log().subscribe(e -> System.out.println(e));

        // Print 10 times each value from intNumbersFlux that's greater than 5
        // TODO: Write code here
        // ReactiveSources.intNumbersFlux().filter(e -> e > 5).map(e -> e * 10).log().subscribe(e -> System.out.println(e));


        // Print 10 times each value from intNumbersFlux for the first 3 numbers emitted that's greater than 5
        // TODO: Write code here

        ReactiveSources.intNumbersFlux().filter(e -> e > 5).map(e -> e * 10).take(3).subscribe(e -> System.out.println(e));


        // Print each value from intNumbersFlux that's greater than 20. Print -1 if no elements are found
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().filter(e -> e > 20).defaultIfEmpty(-1).subscribe(e -> System.out.println(e));


        // Switch ints from intNumbersFlux to the right user from userFlux
        // TODO: Write code here

        // Print only distinct numbers from intNumbersFluxWithRepeat
        // TODO: Write code here

        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
