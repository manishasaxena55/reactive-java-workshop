package com.paytm.reactive;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class AnotherSubscriber {
    public static void main(String[] args) throws IOException {

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
            System.out.println(" Item received..." + value);
            request(1);
        }
    }
}
