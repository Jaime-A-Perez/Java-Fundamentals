package loops;

public class Loop {
    public static void main(String[] args) {
        // Loop for
        //for( int i = 1; i <= 5; i = i + 2 ) {
        for( int i = 2; i <= 5; i+=2 ) {
            System.out.println("Value: " + i);
        }

        int counter = 0;
        int acumulator = 0;
        // Loop while
        while (counter < 5) {
            System.out.println("Counter: " + counter);
            acumulator = acumulator + counter;
            counter++;
        }
        System.out.println("Acumulator: " + acumulator);

        int counter2 = 0;
        // Loop do-while
        do{
            System.out.println("Counter2 :" + counter2);
            counter2++;
        } while (counter2 < 5);
    }
}
