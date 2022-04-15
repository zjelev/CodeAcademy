import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // System.out.println("Input two numbers: ");
        // double num1 = scan.nextDouble();
        // double num2 = scan.nextDouble();
        // System.out.println("The average is " + average(num1, num2));

        // System.out.println("Input a sentence: ");
        // String input = System.console().readLine();
        // System.out.println(countVowels(input));

        // 1
        // String somethingInTheWay = couplet() + chorus() + couplet() + chorus();
        // System.out.printf(somethingInTheWay);

        // 2
        // String theMiddle = theMiddle(scan.next());
        // System.out.println(theMiddle);

        // 4
        System.out.print("Input shape: ");
        String input = scan.next();

        if (input.equalsIgnoreCase("circle")) {
            System.out.print("Input radius: ");
            double r = scan.nextDouble();
            if (r > 0) {
                System.out.print("The area of the circle is " + area(r));
            } else {
                System.out.println("In our Universe, radius can not be negative.");
            }
        } else {
            System.out.print("Input side: ");
            double a = scan.nextDouble();
            System.out.print("Input height: ");
            double h = scan.nextDouble();

            if (input.equalsIgnoreCase("triangle")) {
                System.out.println("The area of the triangle is " + area("triangle", a, h));
            } else if (input.equalsIgnoreCase("rectangle")) {
                System.out.println("The area of the rectangle is " + area("rectangle", a, h));
            } else {
                System.out.println("Unknown figure!");
            }
        }
    }

    // public static double average(double num1, double num2) {
    // return (num1 + num2) / 2;
    // }

    // public static String countVowels(String input) {
    // String vowels = "aeiou";
    // int vowelsNum = 0;
    // for (int i = 0; i < input.length(); i++) {
    // char currentLetter = input.charAt(i);
    // if (vowels.contains(String.valueOf(currentLetter).toLowerCase())) {
    // vowelsNum++;
    // }
    // }
    // return "The above sentence contains " + vowelsNum + " vowels";
    // }

    static String couplet() {
        String couplet = "%nUnderneath the bridge%n" +
                "Tarp has sprung a leak%n" +
                "And the animals I've trapped%n" +
                "Have all become my pets%n" +
                "And I'm living off of grass%n" +
                "And the drippings from my ceiling%n" +
                "It's okay to eat fish%n" +
                "Cause they don't have any feelings%n";
        return couplet;
    }

    static String chorus() {
        String output = "";
        String secondLine = "%nMmm-mmm";
        for (int i = 0; i < 6; i++) {
            String firstLine = "%nSomething in the way";
            if (i % 2 == 1) {
                firstLine += ", yeah";
            }
            output += firstLine;
            output += secondLine;
        }
        return output + "%n";
    }

    static String theMiddle(String input) {
        int position = input.length() % 2 == 0 ? input.length() / 2 - 1 : input.length() / 2;
        int length = input.length() % 2 == 0 ? 2 : 1;
        String output = "";
        output += String.valueOf(input.charAt(position));
        System.out.println(output);
        return input.substring(position, position + length);
    }

    static double area(String shape, double a, double h) {
        return shape.equalsIgnoreCase("triangle") ? a * h / 2 : a * h;
    }

    static double area(double a) {
        return Math.PI * a * a;
    }
}
