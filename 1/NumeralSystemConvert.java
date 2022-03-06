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
        
        if (toBase < 10) {
            String res = "";
            while (number > 0) {
                res += number % toBase;
                number /= toBase;
            }
            
            char[] resChar = res.toCharArray();
            for (int i = res.length() - 1; i >= 0; i--) {
                out.print(resChar[i]);
            }
        } else {
            out.println("Base shuld be < 10");
        }

        out.println("\nChecking: ");
        out.println(Integer.toString(Integer.parseInt(input, 10), toBase));
    }
}