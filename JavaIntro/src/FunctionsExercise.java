import java.util.Scanner;

public class FunctionsExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which task would you like to run? ");
        int taskNum = scan.nextInt();

        switch (taskNum) {
            case 4:
                System.out.print("Input number: ");
                int a = scan.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d * %d = %d\n", a, i, multiply(a, i));
                }
                break;

            case 2:
                int mylike = likes(10, null, true);
                System.out.println(mylike);

            case 3:
                System.out.println("Input number of players");
                int numPlayers = scan.nextInt();
                System.out.println("Input number of rollings");
                int numRolls = scan.nextInt();
                int max = 0;
                int bestPlayer = 0;
                for (int i = 1; i <= numPlayers; i++) {
                    int sum = 0;
                    for (int j = 0; j < numRolls; j++) {
                        long current = diceRoll();
                        sum += current;
                    }
                    System.out.println("Player No. " + i + " scores " + sum);
                    if (sum > max) {
                        max = sum;
                        bestPlayer = i;
                    }
                }
                System.out.println("Player " + bestPlayer + " wins.");

            default:
                break;
        }
    }

    private static long diceRoll() {
        double f = Math.random() / Math.nextDown(1.0);
        int min = 1;
        int max = 6;
        double x = min * (1.0 - f) + max * f;
        return Math.round(x);
    }

    private static int likes(int counter, String comment, boolean doILike) {
        System.out.println(comment);
        if (doILike) {
            counter++;
        }
        return counter;
    }

    private static int multiply(int a, int b) {
        if (b > 0) {
            return a + multiply(a, --b);
        } else {
            return 0;
        }
    }
}
