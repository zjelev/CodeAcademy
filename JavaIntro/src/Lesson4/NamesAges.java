package Lesson4;

import static java.lang.System.out;
import java.util.Scanner;

public class NamesAges {
    public static void main(String[] args) {
        // 1
        String myName;
        myName = "Zlatomir";
        out.println(myName);
        //2
        String wifeName = "Marina";
        boolean areEqual = myName.equals(wifeName);
        out.println(areEqual);
        String friendName = "zlatomir";
        areEqual = myName.equalsIgnoreCase(friendName);
        out.println(areEqual);
        out.println(myName.compareTo(wifeName));
        //3
        String myFamilyName = "Zhelev";
        out.println(myName + "\n" + myFamilyName);
        //4
        int myAge = 45;
        out.println(myName + " " + myFamilyName + " " + myAge);
        //5
        out.println(myName + "\n" + myFamilyName + "\n" + myAge);
    }
    
}
