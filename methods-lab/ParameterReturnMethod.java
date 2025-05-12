public class ParameterReturnMethod {
    public static void main(String[] args) {
        String result = transformText("Java");
        System.out.println("Transformed text: " + result);
    }

    // A method that accepts a string and returns a transformed string
    public static String transformText(String input) {
        return input.toUpperCase() + " is awesome!";
    }
}

