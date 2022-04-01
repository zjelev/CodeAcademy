package Lesson4;

import static java.lang.System.out;

public class Numbers {
    public static void main(String[] args) {
        //lecture
        char myChar = 74;
        myChar = '\u004A';
        out.println(myChar);
        byte x = 126;
        byte y = 127;
        int z = x + y;

        //homework
        //1
        short numOne = -250;
        short numTwo = 250;
        int numThree = 4589498;
        double numFour = 10_000_000_000_000_000_000D;
        long numFive = -9_000_000_000_000_000_000L;
        out.println(numOne + "\n" + numTwo + "\n" + numThree + "\n" + numFour + "\n" + numFive);
        
        //2
        int numSix = 43112;
        int numSeven = -1357674;
        int numEight = 1357674;
        int numNine = -1_357_674_000;
        long numTen = 3_657_895_000L;
        out.println(numSix + "\n" + numSeven + "\n" + numEight + "\n" + numNine + "\n" + numTen);

        //3
        double num = 18_398_458_438_583_853.398_759_372_849_284_22;
        double num1 = 1_839_845_876_675.398_759_372;
        String num3 = "18398458438583853000000123456789.132456789000000039875937284928422";
        BigDecimal bigPostive = new BigDecimal(num3);
        out.println(bigPostive);
        out.println(String.format("%.17f", num));
        out.println(String.format("%.9f", num1));
    }
}
