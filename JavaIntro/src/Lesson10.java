import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            if (i >= 4 && i <= 6) { // i != 5
                continue;
            }
            System.out.println(i);
        }
    }
}
