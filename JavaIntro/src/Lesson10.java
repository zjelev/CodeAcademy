import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // long currentTime = System.currentTimeMillis();
        // long nanoTime = System.nanoTime();
        // System.out.println("Current start time is: " + currentTime);
        // System.out.println("Current nano time is: " + nanoTime);

        // int count = 0;

        // do {
        // count++;
        // if (count % 1000000 == 0) {
        // System.out.println(count);
        // }
        // } while (count < 1_000_000_000);

        // long currentTimeStop = System.currentTimeMillis();
        // long nanoTimeStop = System.nanoTime();

        // System.out.println("Current stop time is: " + currentTimeStop);
        // System.out.println("Current stop nano time is: " + nanoTimeStop);

        // System.out.println("currentTimeMillis measure " + (currentTimeStop -
        // currentTime) + " milliseconds");
        // System.out.println("nanoTime measure " + (nanoTimeStop - nanoTime)/1000000 +
        // " milliseconds");

        for (byte i = 1; i <= 6; i++) {
            System.out.println("outer iteration " + i);
            for (int j = 0; j <= 5; j++) {
                if (j <= 2 || j >= 4) { // i != 5
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
