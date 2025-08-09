package conditionals;

public class Conditionals {
    public static void main(String[] args) {
        int age = 17;
        age = 20;
        double average = 7.5;
        boolean isAdult = age > 17;
        boolean hasPassingGrade = average >= 7;

        int day = 3;

        // if conditional
        if (isAdult && hasPassingGrade) {
            System.out.println("The student meets the requirements");
        }
        if (isAdult) {
            System.out.println("Over 18 years old");
        } else if (age <= 0) {
            System.out.println("Invalid data");
        } else {
            System.out.println("Under 18 years old");
        }

        // switch conditional
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid data");
        }
    }
}
