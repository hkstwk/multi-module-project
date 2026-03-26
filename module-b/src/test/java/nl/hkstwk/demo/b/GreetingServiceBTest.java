package nl.hkstwk.demo.b;

import nl.hkstwk.demo.a.GreetingServiceA;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreetingServiceBTest {

    @Test
    void greeting() {
        GreetingServiceA greetingServiceA = new GreetingServiceA();
        String result = greetingServiceA.greeting("harm");
        assertThat("Hello harm from module A!").isEqualTo(result);
    }
}