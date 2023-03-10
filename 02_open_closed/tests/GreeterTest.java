import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {
    @Test
    public void testSaysHello() {
        Greeter greeter = new Greeter();
        assertEquals("Hello.", greeter.greet());
    }

    @Test
    public void testSaysHelloFormally() {
        Greeter greeter = new Greeter();
        greeter.setFormality("formal");
        assertEquals("Good evening", greeter.greet());
    }

    @Test
    public void testSaysHelloCasually() {
        Greeter greeter = new Greeter();
        greeter.setFormality("casual");
        assertEquals("Goodday?", greeter.greet());
    }

    @Test
    public void testSaysHelloIntimately() {
        Greeter greeter = new Greeter();
        greeter.setFormality("intimate");
        assertEquals("Hello darling!", greeter.greet());
    }

    // --- new tests added ---
    @Test
    public void testGreetingDefault() {
        Greeter myGreeting = new Greeter();
        myGreeting.setGreetType(new GreetDefault());
        assertEquals("Hello.", myGreeting.greet());
    }

    @Test
    public void testGreetingFormal() {
        Greeter myGreeting = new Greeter();
        myGreeting.setGreetType(new GreetFormal());
        assertEquals("Good evening.", myGreeting.greet());
    }

    @Test
    public void testGreetingCasual() {
        Greeter myGreeting = new Greeter();
        myGreeting.setGreetType(new GreetCasual());
        assertEquals("G'day.", myGreeting.greet());
    }

    @Test
    public void testGreetingIntimate() {
        Greeter myGreeting = new Greeter();
        myGreeting.setGreetType(new GreetIntimate());
        assertEquals("Hello darling.", myGreeting.greet());
    }

    // test of new greeting
    @Test
    public void testGreetingFrench() {
        Greeter myGreeting = new Greeter();
        myGreeting.setGreetType(new GreetFrench());
        assertEquals("Bonjour.", myGreeting.greet());
    }
}