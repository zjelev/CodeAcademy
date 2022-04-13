import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Input two numbers: ");
        // double num1 = scan.nextDouble();
        // double num2 = scan.nextDouble();
        // System.out.println("The average is " + average(num1, num2));

        System.out.println("Input a sentence: ");
        String input = System.console().readLine();
        System.out.println(countVowels(input));
    }
    
    public static double average(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static String countVowels(String input) {
        String vowels = "aeiou";
        int vowelsNum = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentLetter = input.charAt(i);
            if (vowels.contains(String.valueOf(currentLetter).toLowerCase())) {
                vowelsNum++;
            }
        }
        return "The above sentence contains " + vowelsNum + " vowels";
    }
}
