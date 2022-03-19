import java.util.Locale;

public class Lesson6 {
    public static void main(String[] args) {
        // d - decimal format - int byte short long
        // f - floating point - float double
        // s - string
        byte myByte = 34;
        short myShort = 30000;
        int num = 8_888_777;
        long myLong = 9_000_000_000L;
        // System.out.printf(Locale.ITALIAN, "%d%n,d%n%,d%n%,d", myByte, myShort, num,
        // myLong);

        float myFloat = 83.14f;
        double myDouble = 6363.7363743d;
        System.out.printf("%09f%n%,.7f", myFloat, myDouble);
        char myLetter = 'n';
        System.out.printf("%c%n", myLetter);
        System.out.printf("%C%n", myLetter);

        String myName = "Zlatomir";
        System.out.printf("'-%20s'%c%n", myName, myLetter);
        System.out.printf("'%S'%n", myName);

        boolean myBoolean = false;
        System.out.printf("%B%n", myBoolean);

        System.out.printf("byte: %d short : %d int : %d long : %d %f %C %b", 
                myByte, myShort, num, myLong, myFloat, myLetter, myName, myBoolean);
    }
}
