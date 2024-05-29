package com.paytm.reactive;

import java.io.IOException;

public class PrintStream {
    public static void main(String[] args) throws IOException {
        // Java8 Streams
        //StreamSources.intNumbersStream().forEach(number -> System.out.println(number));

        //Reactive streams
        // ReactiveSources.intNumbersFlux().subscribe(number -> System.out.println(number));
        // ReactiveSources.intNumberMono().subscribe(number -> System.out.println(number));

        //Operators
        //Print 10 times each value from intNumbersFlux that's greater than 5
        ReactiveSources.intNumbersFlux().filter(e -> e > 5).map(e -> e * 10).subscribe(e -> System.out.println(e));

        System.out.println("Press a key to end");
        System.in.read();
    }
}
