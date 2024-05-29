package com.paytm.reactive.examples;

import com.paytm.reactive.ReactiveSources;
import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // TODO: Write code here
      /*  ReactiveSources.intNumbersFlux().subscribe(item -> System.out.println(item),
                err -> System.out.println(err),
                () -> System.out.println("complete"));
*/
        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());

        System.out.println("Press a key to end");
        System.in.read();
    }

    public static class MySubscriber<T> extends BaseSubscriber<T> {

        public void hookOnSubscribe(Subscription subscription) {
            System.out.println("Subscribed...");
            request(1);

        }

        public void hookOnNext(T value) {
            System.out.println(value + " Item received...");
            request(1);
        }
    }
}