import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which task would you like to run? ");
        int taskNum = scan.nextInt();

        switch (taskNum) {
            case 1:
                double length = scan.nextDouble();
                double width = scan.nextDouble();
                if (length <= 0 || width <= 0) {
                    System.out.println("Not valid");
                } else {
                    if (length == width) {
                        // "Square".sout does not work in vscode
                        System.out.println("Square");
                    } else {
                        System.out.println("Rectangle");
                    }
                }
                break;

            case 2:
                int grade = scan.nextInt();
                if (grade >= 0 && grade <= 100) {
                    if (grade < 25) {
                        System.out.print("F");
                    } else if (grade < 45) {
                        System.out.println("E");
                    } else if (grade < 50) {
                        System.out.println("D");
                    } else if (grade < 60) {
                        System.out.println("C");
                    } else if (grade < 80) {
                        System.out.println("B");
                    } else {
                        System.out.println("A");
                    }
                } else {
                    System.out.println("Invalid");
                }
                break;

            case 3:
                int experience = scan.nextInt();
                double salary = scan.nextDouble();
                double bonus = 0;
                if (salary >= 710) {
                    if (experience >= 0 && experience <= 45) {
                        if (experience >= 15) {
                            bonus = salary * 0.1;
                        } else if (experience >= 10) {
                            bonus = salary * 0.07;
                        } else if (experience >= 5) {
                            bonus = salary * 0.05;
                        } else if (experience >= 0) {
                        }
                        System.out.println("Bonus is " + bonus);
                    } else {
                        System.out.println("Invalid experience ");
                    }
                } else {
                    System.out.println("Invalid salary");
                }
                break;

            case 4:
                System.out.print("What type is the product? ");
                String productType = scan.next();
                double discount = 0;
                System.out.print("What is the regular price? ");
                double price = scan.nextDouble();
                if (productType.equalsIgnoreCase("Clothes")) {
                    discount = 0.2;
                } else if (productType.equalsIgnoreCase("Shoes")) {
                    discount = 0.1;
                } else {
                    discount = 0.05;
                }
                System.out.printf("Price afer discount is %.2f BGN", price - price * discount);
                break;
            default:
                break;
        }
    }
}
