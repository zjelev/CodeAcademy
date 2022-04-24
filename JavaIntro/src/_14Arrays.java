import java.util.Arrays;
import java.util.Scanner;

public class _14Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] original = { 15, 13.2, 0.000125, -6, 2.36, 12345.654987, 20.6, 12.58, -6,
                2.36, -6, 568.32, 12.5, 0, -100000, 12345.654987, 0.000125, 15 };
        
        // 1 - Remove certain value
        System.out.print("Task 1 - Input value to be removed: ");
        double toRemove = scan.nextDouble();
        double[] removedValue = removeValue(original, toRemove);
        System.out.println(Arrays.toString(removedValue));

        // 2 - Insert value at certain index
        System.out.print("Task 2 - Input value to be inserted: ");
        double toInsert = scan.nextDouble();
        System.out.print("Input index to be inserted on: ");
        int onIndex = scan.nextInt();
        double[] oneInserted = insertValue(original, toInsert, onIndex);
        System.out.println(Arrays.toString(oneInserted));

        // 3 - Remove duplicate values
        double[] noDuplicates = removeDuplicates(original);
        System.out.printf("The array without duplicates is: %s\n",
                Arrays.toString(noDuplicates));

        // 4 - Find second min/max
        double maxValue = Double.MIN_VALUE;
        double minValue = Double.MAX_VALUE;
        int maxValueIndex = -1;
        int minValueIndex = -1;
        double[] firstRemoveDuplicates = removeDuplicates(original);
        for (int i = 0; i < firstRemoveDuplicates.length; i++) {
            if (firstRemoveDuplicates[i] > maxValue) {
                maxValue = firstRemoveDuplicates[i];
                maxValueIndex = i;
            }
            if (firstRemoveDuplicates[i] < minValue) {
                minValue = firstRemoveDuplicates[i];
                minValueIndex = i;
            }
        }
        double secondMaxValue = Double.MIN_VALUE;
        double secondMinValue = Double.MAX_VALUE;
        for (int i = 0; i < firstRemoveDuplicates.length; i++) {
            if (firstRemoveDuplicates[i] > secondMaxValue && i != maxValueIndex) {
                secondMaxValue = firstRemoveDuplicates[i];
            }
            if (firstRemoveDuplicates[i] < secondMinValue && i != minValueIndex) {
                secondMinValue = firstRemoveDuplicates[i];
            }
        }
        System.out.printf("Second max value is %f and second min value is %f\n",
                secondMaxValue, secondMinValue);

        // 5 - The Matrix
        System.out.print("Input matrix size: ");
        int size = scan.nextInt();
        int[][] firstMatrix = new int[size][size];
        int[][] secondMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Input values on row " + i + ", column " + j + " in both matrises: ");
                firstMatrix[i][j] = scan.nextInt();
                secondMatrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Printed side by side: ");
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(firstMatrix[i]) + " " + Arrays.toString(secondMatrix[i]));
        }

        System.out.println("Sum of elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print("[");
            for (int j = 0; j < size - 1; j++) {
                int sumElement = firstMatrix[i][j] + secondMatrix[i][j];
                System.out.print(sumElement + ", ");
            }
            System.out.printf("%d]\n", firstMatrix[i][size - 1] + secondMatrix[i][size - 1]);
        }

        System.out.println("Direct sum: ");
        int[][] directSum = new int[firstMatrix[0].length + secondMatrix[0].length][firstMatrix.length
                + secondMatrix.length];

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                directSum[i][j] = firstMatrix[i][j];
            }
        }

        int secondMatrixRow = 0;
        for (int i = firstMatrix.length; i < directSum.length; i++) {
            int secondMatrixCol = 0;
            for (int j = firstMatrix[0].length; j < directSum[i - 1].length; j++) {
                directSum[i][j] = secondMatrix[secondMatrixRow][secondMatrixCol];
                secondMatrixCol++;
            }
            secondMatrixRow++;
        }

        for (int[] is : directSum) {
            System.out.println(Arrays.toString(is));
        }
    }

    private static double[] removeDuplicates(double[] original) {
        double[] noDuplicatesTemp = new double[original.length];
        int index = 0;
        for (int i = 0; i < original.length; i++) {
            boolean duplicateFound = false;
            for (int j = i + 1; j < original.length; j++) {
                if (original[i] == original[j]) {
                    duplicateFound = true;
                    break;
                }
            }
            if (!duplicateFound) {
                noDuplicatesTemp[index] = original[i];
                index++;
            }
        }
        double[] noDuplicates = trimArray(noDuplicatesTemp, index);
        return noDuplicates;
    }

    private static double[] trimArray(double[] arr, int index) {
        double[] trimmedArr = new double[index];
        for (int i = 0; i < index; i++) {
            trimmedArr[i] = arr[i];
        }
        return trimmedArr;
    }

    private static double[] insertValue(double[] original, double toInsert, int onIndex) {
        double[] oneInserted = new double[original.length + 1];
        if (onIndex < 0 || onIndex > original.length) {
            System.out.println("Invalid index");
        } else {
            for (int i = 0; i < onIndex; i++) {
                oneInserted[i] = original[i];
            }
            oneInserted[onIndex] = toInsert;
            for (int i = onIndex; i < original.length; i++) {
                oneInserted[i + 1] = original[i];
            }
        }
        return oneInserted;
    }

    private static double[] removeValue(double[] original, double value) {
        double[] removedValueTemp = new double[original.length];
        int newArrIndex = 0;
        for (int i = 0; i < original.length; i++) {
            if (original[i] != value) {
                removedValueTemp[newArrIndex] = original[i];
                newArrIndex++;
            }
        }

        return trimArray(removedValueTemp, newArrIndex);
    }
}