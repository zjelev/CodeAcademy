import java.util.Arrays;

public class _14Arrays {
    public static void main(String[] args) {
        // 1
        double[] temps = { 15, 13.2, -6, 2.36, 20.6, 12.58 };
        System.out.println(Arrays.toString(temps));
        System.out.println(calcAverage(temps));

        int removeIndex = -1;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] == -6) {
                removeIndex = i;
            }
        }

        double[] newTemps = new double[temps.length - 1];

        for (int i = 0; i < removeIndex; i++) {
            newTemps[i] = temps[i];
        }
        for (int i = removeIndex; i < temps.length - 1; i++) {
            newTemps[i] = temps[i + 1];
        }

        // Raboti samo ako removeIndex e pred-pred-poslednia
        // for (int i = 0; i <= newTemps.length - 1; i++) {
        // if (i == removeIndex) {
        // newTemps[i] = temps[i + 1];
        // continue;
        // }
        // newTemps[i] = temps[i];
        // }

        System.out.println(Arrays.toString(newTemps));

        double[][] grades = {
                // A B C D
                { 6, 3, 2, 4 },
                { 5, 3, 6, 4 },
                { 6, 3, 5, 5 },
                { 3, 3, 4, 6 }
        };

        double[] math = new double[grades[0].length];
        for (int i = 0; i < grades[0].length; i++) {
            math[i] = grades[0][i];
        }
        // System.out.println(Arrays.toString(math));
        // System.out.println("Average math grade is " + calcAverage(math));
    }

    private static double calcAverage(double[] temps) {
        double total = 0;
        for (int i = 0; i < temps.length; i++) {
            total += temps[i];
        }
        return total / temps.length;
    }

    // C# List == Java ArrayList
}
