public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getClass() + " with message: " + e.getMessage());
        } finally {
            System.out.println("This will always execute.");
        }
    }
}

