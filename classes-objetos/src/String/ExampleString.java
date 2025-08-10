package String;

public class ExampleString {
    public static void main(String[] args) {
        String name = "Mary";
        String name2 = "Mary";

        String name3 = new String("Mary");

        System.out.println(name2 == name);
        System.out.println(name3 == name);
        System.out.println(name.toUpperCase());
        System.out.println(name);
    }
}
