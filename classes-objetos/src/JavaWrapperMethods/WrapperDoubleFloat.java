package JavaWrapperMethods;

public class WrapperDoubleFloat {
    public static void main(String[] args) {
        // Examples with Double
        double number = Double.parseDouble("3.14"); // number = 3.14
        System.out.println("The value of 'number' is: " + number);

        Double wrapper = Double.valueOf("3.14"); // wrapper = 3.14 (as a Double object)
        System.out.println("The value of 'wrapper' is: " + wrapper);

        int result = Double.compare(3.14, 2.71); // result = 1 (because 3.14 > 2.71)
        System.out.println("The result of 'Double.compare(3.14, 2.71)' is: " + result);

        String text = Double.toString(3.24f); // text = "3.24"
        System.out.println("The value of 'text' is: " + text);



        // Examples with Float
        float number2 = Float.parseFloat("3.14"); // number2 = 3.14
        System.out.println("The value of 'number2' is: " + number2);

        Float wrapper3 = Float.valueOf("3.14"); // wrapper3 = 3.14 (as a Float object)
        System.out.println("The value of 'wrapper3' is: " + wrapper3);

        String text2 = Float.toString(3.14f); // text2 = "3.14"
        System.out.println("The value of 'text2' is: " + text2);
    }
}