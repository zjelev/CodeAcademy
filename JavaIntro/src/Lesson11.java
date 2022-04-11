import java.util.Scanner;

public class Lesson11 {
    // 7
    static final int MY_PIN = 1234; // za da moje da byde izvikan v class sys stati4no povedenie

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which task would you like to run? ");
        int taskNum = scan.nextInt();

        switch (taskNum) {
            case 1:
                System.out.print("Input square size: ");
                int squareSize = -1;
                while (squareSize < 0 || squareSize > 30) {
                    squareSize = scan.nextInt();
                }
                for (int i = 0; i < squareSize; i++) {
                    for (int j = 0; j < squareSize; j++) {
                        System.out.print("# ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                String repeat = "No";
                do {
                    double numOne = scan.nextDouble();
                    double numTwo = scan.nextDouble();
                    System.out.println(numOne + numTwo);
                    System.out.println("Do you want to repeat?");
                    repeat = scan.next();
                } while (repeat.equalsIgnoreCase("Yes"));
                break;

            case 3:
                int positive = 0;
                int negative = 0;
                int zeroes = 0;
                String end = "";
                do {
                    System.out.print("Enter an integer: ");
                    int num = scan.nextInt();
                    if (num > 0) {
                        positive++;
                    } else if (num < 0) {
                        negative++;
                    } else {
                        zeroes++;
                    }
                    System.out.println("Do you want to end?");
                    end = scan.next();
                } while (end.equalsIgnoreCase("n"));
                System.out.println("Number of positive: " + positive);
                System.out.println("Number of negative: " + negative);
                System.out.println("Number of zeroes" + zeroes);
                break;

            case 4:
                int number;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                String stop = "y";
                do {
                    number = scan.nextInt();
                    if (number > max) {
                        max = number;
                    }
                    if (number < min) {
                        min = number;
                    }
                    System.out.println("Do you want to end?");
                    stop = scan.next();
                } while (stop.equalsIgnoreCase("n"));
                System.out.println("Maximum is: " + max);
                System.out.println("Minimum is: " + min);
                break;

            case 5:
                break;

            case 6:
                break;

            case 7:
                break;

            default:
                System.out.println("No such task.");
                break;

        }
    }
}
