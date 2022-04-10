import java.util.Scanner;

public class Lesson11 {
    //7
    static final int MY_PIN = 1234; // za da move da byde izvikan v class sys static povedenie
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 2
        // String repeat = "No";
        // do {
        //     double numOne = scan.nextDouble();
        //     double numTwo = scan.nextDouble();
        //     System.out.println(numOne + numTwo);
        //     System.out.println("Do you want to repeat?");
        //     repeat = scan.next();
        // } while (repeat.equalsIgnoreCase("Yes"));

        // // 3
        // int positive = 0;
        // int negative = 0;
        // int zeroes = 0;
        // String end = "";
        // do {
        //     System.out.print("Enter an integer: ");
        //     int num = scan.nextInt();
        //     if (num > 0) {
        //         positive++;
        //     } else if (num < 0){
        //         negative++;
        //     } else {
        //         zeroes++;
        //     }
        //     System.out.println("Do you want to end?");
        //     end = scan.next();
        // } while (end.equalsIgnoreCase("n"));
        // System.out.println("Number of positive: " + positive);
        // System.out.println("Number of negative: " + negative);
        // System.out.println("Number of zeroes" + zeroes);

        // 4
        int number;
		int max = Integer.MIN_VALUE;  
        int min = Integer.MAX_VALUE;
        String end = "y";
        do {
            number = scan.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            System.out.println("Do you want to end?");
            end = scan.next();
        } while (end.equalsIgnoreCase("n")); 
        System.out.println("Maximum is: " + max);
        System.out.println("Minimum is: " + min);

        // 5

        // 7
        
        
    }
}
