import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1
        double num1 = scanner.nextDouble();
        System.out.printf("%.5f\n", Math.sqrt(num1));

        // 2 
        int num2 = scanner.nextInt();
        System.out.println(num2 % 2 == 0 ? "even" : "odd");

        // 3
        System.out.printf("|%-16s|%4d|\n", "Ivancho", 2);
        System.out.printf("|%-16s|%4d|\n", "Ani", 5);
        System.out.printf("|%-16s|%4d|\n", "Mariika", 6);
        System.out.printf("|%-16s|%4d|\n", "Pencho", 4);
        System.out.printf("|%-16s|%4d|\n", "Borislavcho", 5);
    }
}
