package scannerExample;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int first = getNumbers(scanner, "Enter first integer");
         int second = getNumbers(scanner, "Enter second integer");

        printArithmeticOperations(first, second);
        compareNumber(first, second);

    }

    public static int getNumbers(Scanner scanner, String message) {
        System.out.println(message);
        int number = scanner.nextInt();
        return number;
    }

    public static void printArithmeticOperations(int firstNumber, int secondNumber) {
        System.out.println("The sum of a + b = " + (firstNumber + secondNumber));
        System.out.println("The subtraction of a - b = " + (firstNumber - secondNumber));
    }

    public static void compareNumber(int first, int second) {
        if (first > second) {
            System.out.println( first + " in greater than " + second);
        } else {
            System.out.println(first + " in less than " + second);
        }
    }
}
