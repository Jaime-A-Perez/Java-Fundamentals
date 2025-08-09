package finalProject;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat;
        do {
        System.out.println("Enter age");
            int age =  scanner.nextInt();
        System.out.println("Enter three qualification");
            int grade1 =  scanner.nextInt();
            int grade2 =  scanner.nextInt();
            int grade3 =  scanner.nextInt();

            int sum = grade1 + grade2 + grade3;
            double average = sum/3.0;
            if (average >= 6) {
        System.out.println("Pass, " + "age: " + age);
            } else {
                System.out.println("Disapproved, " + "age: " + age);
            }
                System.out.println("Do you want to enter new data? (1 for yes, and 2 for not) ");
            int option = scanner.nextInt();
            repeat = option == 1;
        }while (repeat);
        System.out.println("End app");
        scanner.close();
    }
}
