public class ReturnValueMethod {
    public static void main(String[] args) {
        int number = getNumber();
        System.out.println("The returned number is: " + number);
    }

    // A method that returns an integer
    public static int getNumber() {
        return 42;
    }
}

