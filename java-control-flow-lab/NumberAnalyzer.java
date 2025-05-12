// pull in package java.util.Scanner
// which installs with java

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // if-else: Check if number is positive, negative, or zero
        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        // switch: Classify number based on remainder when divided by 3
        int remainder = Math.abs(number) % 3;
        switch (remainder) {
            case 0:
                System.out.println("Number is divisible by 3.");
                break;
            case 1:
                System.out.println("Number has remainder 1 when divided by 3.");
                break;
            case 2:
                System.out.println("Number has remainder 2 when divided by 3.");
                break;
            default:
                System.out.println("Invalid remainder.");
                break;
        }

        // for loop: Print first 5 multiples of the number
        System.out.println("First 5 multiples of " + number + ":");
        for (int i = 1; i <= 5; i++) {
            System.out.println(number * i);
        }

        // while loop: Sum digits of the number
        int tempNumber = Math.abs(number);
        int digitSum = 0;
        while (tempNumber > 0) {
            digitSum += tempNumber % 10;
            tempNumber /= 10;
        }
        System.out.println("Sum of digits: " + digitSum);

        // do-while loop: Keep prompting until a non-zero number is entered
        int newNumber;
        do {
            System.out.print("Enter another number (non-zero): ");
            newNumber = scanner.nextInt();
        } while (newNumber == 0);
        System.out.println("You entered a non-zero number: " + newNumber);

        scanner.close();
    }
}

