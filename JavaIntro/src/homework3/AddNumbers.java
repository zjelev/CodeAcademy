package homework3;
import java.util.Scanner;
import static java.lang.System.out;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Input two numbers:");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double result = firstNumber + secondNumber;
        out.println(result);
    }
}
