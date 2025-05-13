/* Define the GreetingThree class
   and create a 'greeting' object with a String attribute 'name'
   that may be passed when calling the class. */

public class GreetingThree {
    private String name;

    public GreetingThree(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        GreetingThree greeting = new GreetingThree("Alice");

        // run the greet method
        greeting.greet();

        // display the 'name' attribute (in this case "Alice")
        System.out.println(greeting.name);

        // display the HASHCODE of the object
        // note: this can be overridden by setting a toString()
        System.out.println(greeting);
    }

    public void greet() {
        System.out.println("Hello, World!");
    }
}

