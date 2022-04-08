import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 2
        double price = scan.nextDouble();
        int size = scan.nextInt();
        String color = scan.next();
        boolean canReturn = scan.nextBoolean();
        if (price <= 150 && (size == 44 || size == 45) && !color.equalsIgnoreCase("black") && canReturn) {
            System.out.println("Buying!");
        } else {
            System.out.println("Not these!");
        }

        // 3
        int year = scan.nextInt();
        boolean isLeap = false;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                isLeap = true;
            }
        } else if (year % 4 == 0) {
            isLeap = true;
        }
        System.out.println("Is this year leap?: " + isLeap );

        scan.close();
    }
}
