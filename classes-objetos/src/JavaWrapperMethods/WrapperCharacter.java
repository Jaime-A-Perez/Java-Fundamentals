package JavaWrapperMethods;

public class WrapperCharacter {
    public static void main(String[] args) {
        boolean isLetter = Character.isLetter('A'); // isLetter = true
        boolean isDigit = Character.isDigit('5'); // isDigit = true
        boolean isWhiteSpace = Character.isWhitespace(' '); // isWhiteSpace = true
        char upperText = Character.toUpperCase('a'); // uppercase = 'A'
        char lowerText = Character.toLowerCase('A'); // lowercase = 'a'

        System.out.println("Is letter: " + isLetter);
        System.out.println("Is digit: " + isDigit);
        System.out.println("Is whitespace: " + isWhiteSpace);
        System.out.println("Uppercase: " + upperText);
        System.out.println("Lowercase: " + lowerText);
    }
}