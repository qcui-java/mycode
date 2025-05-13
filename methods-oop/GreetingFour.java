/* Define the GreetingFour class
   and create a 'greeting' object with a String attribute 'name'
   that may be passed when calling the class.
   A toString() controls the pattern of the object returned. */

public class GreetingFour {
    private String name;

    public GreetingFour(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        GreetingFour greeting = new GreetingFour("Alice");
        
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
        return "This GreetingFour object has a name = " + name;
    }

    public void greet() {
        System.out.println("Hello, World!");
    }
}

