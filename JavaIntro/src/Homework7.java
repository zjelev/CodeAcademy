import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        System.out.println("Input month: ");
        int month = scanner.nextInt();
        System.out.println("Input day: ");
        int day = scanner.nextInt();
        boolean isSpring = false;
        boolean isCorrect = true;

        if ((month <= 0 || day <= 0 || month > 12 || day > 31)) {
            isCorrect = false;
        }

        if (((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) || (month == 2 && day >= 30)) {
            isCorrect = false;
        }

        if (isCorrect) {
            if (month == 3 && day >= 20) {
                isSpring = true;
            } else if ((month == 4 && day <= 30 ) || month == 5) {
                isSpring = true;
            } else if (month == 6 && day <= 20) {
                isSpring = true;
            } 
            System.out.println(isSpring);
        } else {
            System.out.println("Incorrect input!");
        }

        // 2
        System.out.println("Input mass in kg: ");
        double mass = scanner.nextDouble();
        System.out.println("Input height in m: ");
        double height = scanner.nextDouble();
        if (mass > 0 && height > 0 ) {
        double bmi = mass / (height * height);
        if (bmi < 16) {
        System.out.println("Underweight (Severe thinness)");
        } else if (bmi < 17 ) {
        System.out.println("Underweight (Moderate thinness)");
        } else if (bmi < 18.5 ) {
        System.out.println("Underweight (Mild thinness)");
        } else if (bmi < 25) {
        System.out.println("Normal range");
        } else if (bmi < 30) {
        System.out.println("Overweight (Pre-obese)");
        } else if (bmi < 35) {
        System.out.println("Obese (Class I)");
        } else if (bmi < 40) {
        System.out.println("Obese (Class II)");
        } else {
        System.out.println("Obese (Class III)");
        }
        } else {
        System.out.println("Incorrect input!");
        }

        // 3
        if (day % 2 == 0) {
        System.out.println("Day is even");
        } else {
        System.out.println("Day is odd");
        }

        // 4
        System.out.println("Input side x: ");
        double x = scanner.nextDouble();
        System.out.println("Input side y: ");
        double y = scanner.nextDouble();
        System.out.println("Input side z: ");
        double z = scanner.nextDouble();

        if (x > 0 && y > 0 && z > 0 && x + y > z && x + z > y && y + z > x) {
            if (x == y && x == z) {
                System.out.println("Ravnostranen.");
            } else if (x == y || x == z || y == z) {
                System.out.println("Ravnobedren.");
            } else {
                System.out.println("Raznostranen");
            }
        } else {
            System.out.println("Incorrect input!");
        }

        // 5
        System.out.println("Input month: ");
        int mon = scanner.nextInt();

        switch (mon) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;

            default:
                System.out.println("Incorrect input!");
                break;
        }

        scanner.close();
    }
}
