package com.paytm.reactive;

import java.io.IOException;

public class ReactiveChannels {
    public static void main(String[] args) throws IOException {
/*        ReactiveSources.intNumbersFlux().subscribe(number -> System.out.println(number),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("complete"));*/

        ReactiveSources.intNumbersFluxWithException().subscribe(number -> System.out.println(number),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("complete"));

        System.out.println("Press a key to end");
        System.in.read();
    }
}
