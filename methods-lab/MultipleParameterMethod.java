public class MultipleParameterMethod {
    public static void main(String[] args) {
        int result = addNumbers(5, 7);
        System.out.println("The sum is: " + result);
    }

    // A method that accepts two integers and returns their sum
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}

