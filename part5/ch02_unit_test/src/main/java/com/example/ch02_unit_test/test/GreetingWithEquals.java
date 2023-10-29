package com.example.ch02_unit_test.test;

public class GreetingWithEquals extends Greeting {
    public GreetingWithEquals(String message) {
        super(message);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof GreetingWithEquals) {
            return ((GreetingWithEquals) obj).message.equals(this.message);
        }
        return false;
    }
}
