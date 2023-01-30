/*
    --- commenting out the original code ---
public class Greeter {
    String formality;

    public String greet() {
        if (this.formality == "formal") {
            return "Good evening";
        } else if (this.formality == "casual") {
            return "Goodday?";
        } else if (this.formality == "intimate") {
            return "Hello darling!";
        } else {
            return "Hello.";
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
*/

/*  --- my comments ---
    Programming to the interface (supertype).
    Create an Greet interface specifying the greeting() method for classes to implement.
    Create a new class which implements the Greet interface for each type of greeting.
    New greetings can be added as new classes as needed
    without the need to modify the existing code.
    An existing Greeter object's greeting can be changed dynamically
    using the setter method to set the greetType.
 */
public class Greeter {
    Greet greetType = new GreetDefault();     // set default greeting

    public String greet() {                 // method to return the greeting
        return greetType.greeting();
    }

    public void setGreetType(Greet g) {     // setter method for the greetType variable
        this.greetType = g;
    }


    public static void main(String[] args) {
        // using the default greeting
        Greeter myGreeting = new Greeter();
        System.out.println("The default greeting is: " + myGreeting.greet());

        // changing the greeting dynamically
        myGreeting.setGreetType(new GreetFormal());     // change the greeting type
        System.out.println("The formal greeting is: " + myGreeting.greet());

        myGreeting.setGreetType(new GreetCasual());
        System.out.println("The casual greeting is: " + myGreeting.greet());

        myGreeting.setGreetType(new GreetIntimate());
        System.out.println("The intimate greeting is: " + myGreeting.greet());
    }

}
