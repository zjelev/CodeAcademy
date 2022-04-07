import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;
// import java.util.*;


public class Lesson6 {
    public static void main(String[] args) {
        // System.out.println("Enter your name");
        // String name = System.console().readLine();
        
        // // more difficult than Scanner, obsolete, used mainly for reading text files
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        
        byte age = 0;
        // try {
        //     age = (byte) System.in.read();
        //     System.out.println("You entered " + age);
        //     char sameByte = (char) age;
        //     System.out.println("When converted to char: " + sameByte);
        // }
        // catch (IOException e){
        //     System.out.println(e.getMessage());
        // }

        Scanner scanner = new Scanner(System.in);
        age = scanner.nextByte();
        String myAge = scanner.next();
        boolean isEligible = age >= 18;
        String output = isEligible ? "Yes" : "No";
        System.out.println(output + " " + age + " " + myAge);
        // // d - decimal format - int byte short long
        // // f - floating point - float double
        // // s - string
        short myShort = 30000;
        int num = 8_888_777;
        long myLong = 9_000_000_000L;
        // System.out.printf(Locale.ITALIAN, "%d%n,d%n%,d%n%,d", myByte, myShort, num, myLong);

        // float myFloat = 83.14f;
        // double myDouble = 6363.7363743d;
        // System.out.printf("%09f%n%,.7f", myFloat, myDouble);
        // char myLetter = 'n';
        // System.out.printf("%c%n", myLetter);
        // System.out.printf("%C%n", myLetter);

        // String myName = "Zlatomir";
        // System.out.printf("'-%20s'%c%n", myName, myLetter);
        // System.out.printf("'%S'%n", myName);

        // boolean myBoolean = false;
        // System.out.printf("%B%n", myBoolean);

        // System.out.printf("byte: %d short : %d int : %d long : %d %f %C %b", 
        //         myByte, myShort, num, myLong, myFloat, myLetter, myName, myBoolean);
    }
}
