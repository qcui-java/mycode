/* Define the GreetingFive class
   and create a 'greeting' object with a String attribute 'name'
   that may be passed when calling the class.
   When the greet() method is called, the attribute 'name' is included.
   A toString() controls the pattern of the object returned. */

public class GreetingFive {
    private String name;

    public GreetingFive(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        GreetingFive greeting = new GreetingFive("Alice");

        // run the greet method
        greeting.greet();

        // display the 'name' attribute (in this case "Alice")
        System.out.println(greeting.name);

        // display the HASHCODE of the object
        // note: this can be overridden by setting a toString()
        // System.out.println(greeting);
        // is the same as
        // System.out.println(greeting.toString());
        System.out.println(greeting);
    }

    @Override
    public String toString() {
        // we can return anything we want
        return "This GreetingFive object has a name = " + name;
    }

    public void greet() {
        System.out.println(name + " says, 'One cannot believe impossible things.'");
    }
}

