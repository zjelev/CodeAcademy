import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which task would you like to run? ");
        int taskNo = scan.nextInt();
        
        switch (taskNo) {
            case 1:
                double price = scan.nextDouble();
                int size = scan.nextInt();
                String color = scan.next();
                boolean canReturn = scan.nextBoolean();
                if (price <= 150 && (size == 44 || size == 45) && !color.equalsIgnoreCase("black") && canReturn) {
                    System.out.println("Buying!");
                } else {
                    System.out.println("Not these!");
                }
                break;
            case 2:
                double first = scan.nextDouble();
                double second = scan.nextDouble();
                double diff = Math.round(Math.abs(first - second) * 10000.0) / 10000.0;
                System.out.println("Difference is " + diff);
                if (diff < 0.0001) {
                    System.out.println("Equal to the fourth sign");
                } else if (diff < 0.001) {
                    System.out.println("Equal to the third sign");
                } else if (diff < 0.01) {
                    System.out.println("Equal to the second sign");
                } else if (diff < 0.1) {
                    System.out.println("Equal to the first sign");
                }
                break;
            case 3:
                int year = scan.nextInt();
                String isLeap = "Not a leap year";
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeap = "Leap year";
                    }
                } else if (year % 4 == 0) {
                    isLeap = "Leap year";
                }
                System.out.println(isLeap);
                break;
            case 4:
                String letter = scan.next();
                String vowels = "aeiou";
                if (!((letter.charAt(0) >= 65 && letter.charAt(0) <= 90)
                        || (letter.charAt(0) >= 97 && letter.charAt(0) <= 122))
                        || letter.length() != 1) {
                    System.out.println("Not a letter");
                } else {
                    if (vowels.contains(String.valueOf(letter).toLowerCase())) {
                        System.out.println("Vowel");
                    } else {
                        System.out.println("Consonant");
                    }
                }
                break;
            case 5:
                int a = scan.nextInt();
                int b = scan.nextInt();
                int c = scan.nextInt();
                double x1, x2;
                if (a == 0) {
                    x1 = -c / b;
                    System.out.println("One solution: " + x1);
                } else {
                    int d = b * b - 4 * a * c;
                    if (d > 0) {
                        x1 = (-b + Math.sqrt(d)) / 2 * a;
                        x2 = (-b - Math.sqrt(d)) / 2 * a;
                        System.out.println("2 solutions: " + x1 + " and " + x2);
                    } else if (d == 0) {
                        x1 = -b / 2 * a;
                        x2 = x1;
                        System.out.println("One solution: " + x1);
                    } else {
                        System.out.println("No real solutions.");
                    }
                }
                break;
            default:
                break;
        }

        scan.close();
    }
}
