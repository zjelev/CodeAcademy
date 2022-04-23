import java.util.Arrays;
import java.util.Scanner;

public class _14Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Lection

        double[] original = { 15, 13.2, -6, 2.36, 20.6, 12.58, -6, 2.36, -6, 568.32, 12.5 };
        System.out.println(Arrays.toString(original));
        // System.out.println(calcAverage(original));

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

        // Java ArrayList == C# List

        // Homework
        // // 1
        // System.out.println("Input value to be removed: ");
        // double toRemove = scan.nextDouble();

        // int removeIndex = -1;
        // for (int i = 0; i < original.length; i++) {
        // if (original[i] == toRemove) {
        // removeIndex = i;
        // }
        // }

        // double[] oneValueRemoved = new double[original.length - 1];

        // for (int i = 0; i < removeIndex; i++) {
        // oneValueRemoved[i] = original[i];
        // }
        // for (int i = removeIndex; i < original.length - 1; i++) {
        // oneValueRemoved[i] = original[i + 1];
        // }

        // // Raboti samo ako removeIndex e pred-pred-poslednia
        // // for (int i = 0; i <= oneValueRemoved.length - 1; i++) {
        // // if (i == removeIndex) {
        // // oneValueRemoved[i] = original[i + 1];
        // // continue;
        // // }
        // // oneValueRemoved[i] = original[i];
        // // }

        // System.out.println(Arrays.toString(oneValueRemoved));

        // // 2
        // System.out.println("Input value to be inserted: ");
        // double toInsert = scan.nextDouble();
        // System.out.println("Input index to be inserted on: ");
        // int onIndex = scan.nextInt();

        // if (onIndex < 0 || onIndex > original.length) {
        // System.out.println("Invalid index");
        // } else {
        // double[] oneValueInserted = new double[original.length + 1];

        // for (int i = 0; i < onIndex; i++) {
        // oneValueInserted[i] = original[i];
        // }
        // oneValueInserted[onIndex] = toInsert;
        // for (int i = onIndex; i < original.length; i++) {
        // oneValueInserted[i + 1] = original[i];
        // }
        // System.out.println(Arrays.toString(oneValueInserted));
        // }

        // // 3
        // double[] noDuplicates = new double[original.length];
        // int index = 0;
        // for (int i = 0; i < original.length; i++) {
        //     boolean duplicateFound = false;
        //     for (int j = i + 1; j < original.length; j++) {
        //         if (original[i] == original[j]) {
        //             duplicateFound = true;
        //             break;
        //         }
        //     }
        //     if (!duplicateFound) {
        //         noDuplicates[index] = original[i];
        //         index++;
        //     }
        // }
        // System.out.println(Arrays.toString(noDuplicates));

        // 4
        double maxValue = Double.MIN_VALUE;
        double minValue = Double.MAX_VALUE;
        int maxValueIndex = -1;
        int minValueIndex = -1;
        for (int i = 0; i < original.length; i++) {
            if (original[i] > maxValue) {
                maxValue = original[i];
                maxValueIndex = i;
            }
            if (original[i] < minValue) {
                minValue = original[i];
                minValueIndex = i;
            }
        }
        double secondMaxValue = Double.MIN_VALUE;
        double secondMinValue = Double.MAX_VALUE;
        int secondMaxValueIndex = -1;
        int secondMinValueIndex = -1;
        for (int i = 0; i < original.length; i++) {
            if (original[i] > secondMaxValue && i != maxValueIndex) {
                secondMaxValue = original[i];
                secondMaxValueIndex = i;
            }
            if (original[i] < secondMinValue && i != minValueIndex) {
                secondMinValue = original[i];
                secondMinValueIndex = i;
            }
        }
        System.out.printf("Second max value is %f and second min value is %f", secondMaxValue, secondMinValue);
    }

    private static double calcAverage(double[] original) {
        double total = 0;
        for (int i = 0; i < original.length; i++) {
            total += original[i];
        }
        return total / original.length;
    }
}
