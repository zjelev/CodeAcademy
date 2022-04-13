import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Lesson11 {
    // 7
    static final int MY_PIN = 1234; // za da moje da byde izvikan v class sys stati4no povedenie

    public static void main(String[] args)
            throws java.io.UnsupportedEncodingException 
            {
        Scanner scan = new Scanner(System.in);
        // PrintStream printStream = new PrintStream(System.out, true, "windows-1251"); // true = autoflush
        // PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out, "windows-1251"));
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
                String repeat = "n";
                do {
                    System.out.println("Enter two numbers: ");
                    double numOne = scan.nextDouble();
                    double numTwo = scan.nextDouble();
                    System.out.println(numOne + numTwo);
                    System.out.print("Do you want to repeat? y/n: ");
                    repeat = scan.next();
                } while (repeat.equalsIgnoreCase("y"));
                break;

            case 3:
                int positive = 0;
                int negative = 0;
                int zeroes = 0;
                String end = "n";
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
                    System.out.println("Do you want to end? y/n");
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
                    System.out.print("Enter an integer: ");
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
                System.out.println("Input a sentence: ");
                String input = System.console().readLine();
                String vowels = "aeiou";
                int vowelsNum = 0;
                for (int i = 0; i < input.length(); i++) {
                    char currentLetter = input.charAt(i);
                    if (vowels.contains(String.valueOf(currentLetter).toLowerCase())) {
                        vowelsNum++;
                    }
                }
                System.out.printf("The above sentence contains %d vowels", vowelsNum);
                break;

            case 6:
                System.out.print("Enter an integer: ");
                long num = scan.nextLong();
                long temp = num;
                long reverse = 0;
                long exponent = 1;

                while (temp > 10) {
                    exponent *= 10;
                    temp /= 10;
                }

                while (num > 0) {
                    reverse += num % 10 * exponent;
                    num /= 10;
                    exponent /= 10;
                }
                System.out.println(reverse);
                System.out.println(new StringBuffer(String.valueOf(reverse)).reverse());
                break;

            case 7:
                // System.out.println(System.getProperty("file.encoding"));
                // System.out.println(Charset.defaultCharset().displayName());
                System.out.println("Enter PIN code: ");
                int pin = 0;
                boolean locked = true;
                for (int i = 0; i < 3; i++) {
                    pin = scan.nextInt();
                    if (pin == MY_PIN) {
                        String myString = "Правилно, добре дошли обратно.";
                        byte bytes[] = myString.getBytes("windows-1251");
                        String value = new String(bytes, "UTF-8");
                        System.out.println(value);
                        locked = false;
                        break;
                    } else {
                        String myString = "Неправилно, опитайте отново.";
                        byte bytes[] = myString.getBytes("windows-1251");
                        String value = new String(bytes, "UTF-8");
                        System.out.println(value);
                    }
                }
                if (locked) {
                    String myString = "Съжаляваме, акаунтът ви e заключен.";
                    byte bytes[] = myString.getBytes("windows-1251");
                    String value = new String(bytes, "UTF-8");
                    System.out.println(value);
                }
                break;

            default:
                System.out.println("No such task.");
                break;
        }
        scan.close();
    }
}
