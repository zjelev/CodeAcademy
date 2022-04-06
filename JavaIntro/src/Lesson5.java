import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        int a = 5; // 0101
        // // System.out.println(a++);
        // // System.out.println(++a);
        // // System.out.println(a--);
        // boolean c = a < 36 ? true : false;
        // System.out.println((a < 5) && (c || false));
        int b = 7; // 0111
        // // bitwise: and or xor not
        // //   0101         0101          0101        ~0000 0000 0000 0000 0000 0000 0000 0101
        // // & 0111       | 0111        ^ 0111        =1111 1111 1111 1111 1111 1111 1111 1010
        // // = 0101 = 5   = 0111 = 7    = 0010 = 2
        // System.out.println("a & b = " + (a & b));
        // System.out.println("a | b = " + (a | b));
        // System.out.println("a ^ b = " + (a ^ b));
        // System.out.println("~0 = " + ~0);
        // // assignment
        // a |= b;
        // System.out.println(a);

        // // >> shift right
        // // 1100 = 12
        // // 12 >> 1 = 110 = 6
        // System.out.println(12 >> 1);
        // System.out.println(12 >> 2);
        // System.out.println(12 >> 3);

        // // << shift left
        // // 0001 << 1 == 0010 = 2
        // System.out.println(1 << 1);
        // System.out.println(1 << 2);
        // System.out.println(100 << 3);

        // Homework
        // 1
        System.out.printf("%.5f", Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        // 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input month: ");
        int month = scanner.nextInt();
        System.out.println("Input day: ");
        int day = scanner.nextInt();
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) || (month == 4 && day <= 30) || 
            (month == 5 && day <= 31) || (month == 6 && day <= 20);

        // boolean isSpring = month >= 3 && day >= 20 || month <= 6 && day <=20; // 1 1 yes??
        System.out.println(isSpring ? "yes" : "no");

        // 3
        System.out.println("Input mass in kg: ");
        double mass = scanner.nextDouble();
        System.out.println("Input height in m: ");
        double height = scanner.nextDouble();
        double bmi = mass / (height * height);
        System.out.println("My Body Mass index is " + bmi);
    }
}
