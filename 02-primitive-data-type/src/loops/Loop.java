package loops;

public class Loop {
    public static void main(String[] args) {
        final int MAX_COUNT = 10;
        // Loop for
        //for( int i = 1; i <= 5; i = i + 2 ) {
        for( int CurrentName = 2; CurrentName <= MAX_COUNT; CurrentName+=2 ) {
            System.out.println("Value: " + CurrentName);
        }

        int counter = 0;
        int acumulator = 0;
        // Loop while
        while (counter < MAX_COUNT) {
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
        } while (counter2 < MAX_COUNT);
    }
}
