package com.paytm.reactive.callback;

public class You implements OnShoutListener {
    @Override
    public String onShoutEvent(int msg) {
        switch (msg) {
            case 0:
                return "I am busy";

            case 1:
                return "Wait,coming";
            default:
                return "What???";

        }
    }
}
