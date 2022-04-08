import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // // 1
        // double price = scan.nextDouble();
        // int size = scan.nextInt();
        // String color = scan.next();
        // boolean canReturn = scan.nextBoolean();
        // if (price <= 150 && (size == 44 || size == 45) && !color.equalsIgnoreCase("black") && canReturn) {
        //     System.out.println("Buying!");
        // } else {
        //     System.out.println("Not these!");
        // }

        // 2
        double first = scan.nextDouble();
        double second = scan.nextDouble();
        double diff = Math.abs(first - second);
        if (diff < 0.0001f) {
            System.out.println("Equal to fourth sign");
        } else if (diff < 0.001f) {
            System.out.println("Equal to third sign");
        } else if (diff < 0.01f) {
            System.out.println("Equal to second sign");
        } else if (diff < 0.1f) {
            System.out.println("Equal to first sign");
        }

        // // 3
        // int year = scan.nextInt();
        // String isLeap = "Not a leap year";
        // if (year % 100 == 0) {
        //     if (year % 400 == 0) {
        //         isLeap = "Leap year";
        //     }
        // } else if (year % 4 == 0) {
        //     isLeap = "Leap year";
        // }
        // System.out.println(isLeap);

        // // 4
        // String letter = scan.nextLine();
        // String vowels = "aeiou";
        // if (!((letter.charAt(0) >= 65 && letter.charAt(0) <= 90) || (letter.charAt(0) >= 97 && letter.charAt(0) <= 122))
        //         || letter.length() != 1) {
        //             System.out.println("Not a letter");
        // } else {
        //     if (vowels.contains(String.valueOf(letter).toLowerCase())) {
        //         System.out.println("Vowel");
        //     } else {
        //         System.out.println("Consonant");
        //     }
        // }

        // // 5
        // int a = scan.nextInt();
        // int b = scan.nextInt();
        // int c = scan.nextInt();
        // int d = b * b - 4 * a * c;
        // double x1, x2;
        // if (d > 0) {
        //     x1 = (-b + Math.sqrt(d)) / 2 * a;
        //     x2 = (-b - Math.sqrt(d)) / 2 * a;
        //     System.out.println("2 solutions: " + x1 + " and " + x2);
        // } else if (d == 0) {
        //     x1 = -b / 2 * a;
        //     x2 = x1;
        //     System.out.println("One solution: " + x1);
        // } else {
        //     System.out.println("No real solutions.");
        // }

        scan.close();
    }
}
