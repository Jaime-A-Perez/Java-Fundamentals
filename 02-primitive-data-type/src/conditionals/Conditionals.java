package conditionals;

public class Conditionals {
    public static void main(String[] args) {
        int age = 17;
        age = 20;


        // if conditional
        if (age > 18) {
            System.out.println("Over 18 years old");
        } else if (age <= 0) {
            System.out.println("Invalid data");
        } else {
            System.out.println("Under 18 years old");
        }

        int day = 3;

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
