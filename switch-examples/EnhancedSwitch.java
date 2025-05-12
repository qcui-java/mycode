public class EnhancedSwitch {
    public static void main(String[] args) {
        int number = 2;
        String result = switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "Unknown";
        };
        System.out.println("Number: " + result);
    }
}

