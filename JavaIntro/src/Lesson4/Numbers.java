package Lesson4;

import static java.lang.System.out;

public class Numbers {
    public static void main(String[] args) {
        //1
        short numOne = -250;
        short numTwo = 250;
        int numThree = 4589498;
        double numFour = 10000000000000000000D;
        long numFive = -9000000000000000000L;
        out.println(numOne + "\n" + numTwo + "\n" + numThree + "\n" + numFour + "\n" + numFive);
        
        //2
        int numSix = 43112;
        int numSeven = -1357674;
        int numEight = 1357674;
        int numNine = -1357674000;
        long numTen = 3657895000L;
        out.println(numSix + "\n" + numSeven + "\n" + numEight + "\n" + numNine + "\n" + numTen);

        //3
        double num = 18398458438583853.39875937284928422;
        double num1 = 1839845876675.398759372;
        out.println(num1);
        out.println(String.format("%.9f", num1));
    }
}