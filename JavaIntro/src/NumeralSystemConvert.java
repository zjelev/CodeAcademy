import static java.lang.System.out;
import java.util.Scanner;

public class NumeralSystemConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Input the number:");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        out.println("Input numeral system to be converted to:");
        int toBase = Integer.parseInt(scanner.nextLine());
        scanner.close();
        String result = "";
        
        if (toBase < 10) {
            String reverse = "";
            while (number > 0) {
                reverse += number % toBase;
                number /= toBase;
            }
            
            char[] resChar = reverse.toCharArray();

            for (int i = reverse.length() - 1; i >= 0; i--) {
                result += resChar[i];
            }

            out.println(result);
        } else {
            out.println("Base should be < 10");
        }

        out.print("\nChecking: ");
        String check = Integer.toString(Integer.parseInt(input, 10), toBase);
        if (check.equals(result)) {
            out.println("Match.");
        } else {
            out.println("No Match! The correct number is " + check);
        }
    }
}
