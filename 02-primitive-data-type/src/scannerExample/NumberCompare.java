package scannerExample;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int integerA = scanner.nextInt();
        System.out.println("integer entered: " + integerA);

        System.out.println("Enter an integer");
        int integerB = scanner.nextInt();

        int sum = integerA + integerB;
        int subtraction = integerA - integerB;
        int multiplication = integerA * integerB;
        int division = integerA / integerB;
        int modulus = integerA % integerB;

        System.out.println("Integer entered: " + integerB);
        System.out.println("The sum of " + integerA + " and " + integerB + " is: " + sum);
        System.out.println("The subtraction of " + integerA + " and " + integerB + " is: " + subtraction);
        System.out.println("The multiplication of " + integerA + " and " + integerB + " is: " + multiplication);
        System.out.println("The division of " + integerA + " by " + integerB + " is: " + division);
        System.out.println("The modulus of " + integerA + " and " + integerB + " is: " + modulus);

        if (integerA > integerB) {
            System.out.println( integerA + " in greater than " + integerB);
        } else {
            System.out.println(integerA + " in less than " + integerB);
        }

        System.out.println("The end of app");
        scanner.close();
    }
}
