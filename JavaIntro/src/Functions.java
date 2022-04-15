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

        System.out.print("Which task would you like to run? ");
        int taskNum = scan.nextInt();

        switch (taskNum) {
            case 1:
                String somethingInTheWay = couplet1() + chorus() + couplet2() + chorus();
                System.out.printf(somethingInTheWay);
                break;

            case 2:
                String theMiddle = theMiddle(scan.next());
                System.out.println(theMiddle);
                break;

            case 4:
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
                break;
            default:
                break;
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

    static String couplet1() {
        String couplet = 
        "%nI've nothing much to offer%n" +
        "There's nothing much to take%n" +
        "I'm an absolute beginner%n" +
        "But I'm absolutely sane%n" +
        "As long as we're together%n" +
        "The rest can go to hell%n" +
        "I absolutely love you%n" +
        "But we're absolute beginners%n" +
        "With eyes completely open%n" +
        "But nervous all the same%n";
        return couplet;
    }

    static String couplet2() {
        String couplet = 
        "%nNothing much could happen%n" +
        "Nothing we can't shake%n" +
        "Oh, we're absolute beginners%n" +
        "With nothing much at stake%n" +
        "As long as you're still smiling%n" +
        "There's nothing more I need%n" +
        "I absolutely love you%n" +
        "But we're absolute beginners%n" +
        "But if my love is your love%n" +
        "We're certain to succeed%n";
        return couplet;
    }

    static String chorus1() {
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

    static String chorus() {
        return
        "%nIf our love song%n" +
        "Could fly over mountains%n" +
        "Could laugh at the ocean%n" +
        "Just like the films%n" +
        "There's no reason%n" +
        "To feel all the hard times%n" +
        "To lay down the hard lines%n" +
        "It's absolutely true%n"''
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
