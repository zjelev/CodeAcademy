import java.util.Random;

public class ArraysExercise {
    public static void main(String[] args) {
        // 1
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 19, 22, 30, 11, 16, 0, -9, -1, 12, 10 };
        // int sumToSearch = 10;
        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] + arr[j] == sumToSearch) {
        //             System.out.printf("%d + %d = %d\n", arr[i], arr[j], sumToSearch);
        //         }
        //     }
        // }
        
        // 2
        String[] media = { "BNT", "BTV", "Nova", "Darik", "BNR" };
        for (int i = 0; i < 100000; i++) {
            Random random = new Random();
            int chosen = random.nextInt(50) + 1;
            if (chosen == 51) {
                System.out.println(chosen);
            }
        }
    }
}
