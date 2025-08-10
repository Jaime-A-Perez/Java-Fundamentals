package JavaWrapperMethods;

public class WrapperBoolean {
    public static void main(String[] args) {

        boolean value = Boolean.parseBoolean("true"); // value = true
        System.out.println("The value of 'value' is: " + value);

        Boolean wrapper = Boolean.valueOf("true"); // wrapper = true (as a Boolean object)
        System.out.println("The value of 'wrapper' is: " + wrapper);

        String text = Boolean.toString(true); // text = "true"
        System.out.println("The value of 'text' is: " + text);

        boolean result = Boolean.logicalAnd(true, false); // result = false
        System.out.println("The result of 'Boolean.logicalAnd(true, false)' is: " + result);

        boolean result2 = Boolean.logicalOr(true, false); // result = true
        System.out.println("The result of 'Boolean.logicalOr(true, false)' is: " + result2);

    }
}