package nl.hkstwk.demo.a;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreetingServiceATest {

    @Test
    void greeting() {
        GreetingServiceA greetingServiceA = new GreetingServiceA();
        String result = greetingServiceA.greeting("harm");
        assertThat("Hello harm from module A!").isEqualTo(result);
    }
}