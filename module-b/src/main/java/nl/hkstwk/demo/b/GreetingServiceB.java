package nl.hkstwk.demo.b;

import nl.hkstwk.demo.a.GreetingServiceA;public class GreetingServiceB {
    private final GreetingServiceA greetingServiceA = new GreetingServiceA();

    public String greeting(String name) {
        return "[B] " + greetingServiceA.greeting(name);
    }
}
