import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which task would you like to run? ");
        int taskNum = scan.nextInt();

        switch (taskNum) {
            case 1:
                System.out.print("Input integer: ");
                int input = 0;
                int sum = 0;
                do {
                    input = scan.nextInt();
                    if (input > 0 && input <= 100) {
                        sum += input;
                    }
                } while (input <= 100);
                System.out.println("The sum of positive numbers up to 100 inputted is " + sum);
                break;

            case 2:
                int num = -1;
                while (num < 0) {
                    System.out.print("Input non-negative integer: ");
                    num = scan.nextInt();
                }
                System.out.print("Factoriel of " + num);

                int factoriel = 1;
                while (num > 0) {
                    factoriel *= num--;
                }
                System.out.printf(" is %d", factoriel);
                break;

            case 3:
                System.out.print("Input an integer: ");
                int size = scan.nextInt();
                for (int s = size; s > 0; s--) {
                    for (int j = 1; j <= s; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                break;

            case 4:
                System.out.print("Input an integer: ");
                int upperSize = scan.nextInt();
                String offset = "";
                for (int s = upperSize; s > 0; s--) {
                    System.out.print(offset);
                    for (int j = 1; j <= s; j++) {
                        System.out.print("# ");
                    }
                    offset += " ";
                    System.out.println();
                }
                break;

            case 5:
                System.out.print("Input a word: ");
                String word = scan.next();
                String reversed = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed += word.charAt(i);
                }
                System.out.println("Reversed is " + reversed);
                if (word.equals(reversed)) {
                    System.out.println("It's a palindrome!");
                } else {
                    System.out.println("Nope.");
                }
                break;
            default:
                System.out.println("No such task.");
                break;
        }
    }
}
