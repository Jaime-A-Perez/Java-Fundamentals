package JavaWrapperMethods;

public class WrapperInteger {

    public static void main(String[] args) {
        // Examples with Integer
        int number = Integer.parseInt("123"); // number = 123
        System.out.println("The value of 'number' is: " + number);

        Integer wrapper = Integer.valueOf("123"); // wrapper = 123 (as an Integer object)
        System.out.println("The value of 'wrapper' is: " + wrapper);

        String text = Integer.toString(123); // text = "123"
        System.out.println("The value of 'text' is: " + text);

        int result = Integer.compare(10, 20); // result = -1 (because 10 < 20)
        System.out.println("The result of 'Integer.compare(10, 20)' is: " + result);

        int max = Integer.max(10, 20); // max = 20
        System.out.println("The value of 'max' is: " + max);

        int min = Integer.min(10, 20); // min = 10
        System.out.println("The value of 'min' is: " + min);

        // Examples with Byte
        byte number2 = Byte.parseByte("127"); // number2 = 127
        System.out.println("The value of 'number2' is: " + number2);

        Byte wrapper2 = Byte.valueOf("127"); // wrapper2 = 127 (as a Byte object)
        System.out.println("The value of 'wrapper2' is: " + wrapper2);

        String text2 = Byte.toString((byte) 127); // text2 = "127"
        System.out.println("The value of 'text2' is: " + text2);

        // Examples with Short
        short number3 = Short.parseShort("32000"); // number3 = 32000
        System.out.println("The value of 'number3' is: " + number3);

        Short wrapper3 = Short.valueOf("32000"); // wrapper3 = 32000 (as a Short object)
        System.out.println("The value of 'wrapper3' is: " + wrapper3);

        String text3 = Short.toString((short) 32000); // text3 = "32000"
        System.out.println("The value of 'text3' is: " + text3);

        // Examples with Long
        long number4 = Long.parseLong("123456789"); // number4 = 123456789
        System.out.println("The value of 'number4' is: " + number4);

        Long wrapper4 = Long.valueOf("123456789"); // wrapper4 = 123456789 (as a Long object)
        System.out.println("The value of 'wrapper4' is: " + wrapper4);

        String text4 = Long.toString(123456789L); // text4 = "123456789"
        System.out.println("The value of 'text4' is: " + text4);
    }

}