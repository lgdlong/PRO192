package Workshop1;

import java.util.Arrays;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows, columns;
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        int length = rows * columns;

        // Enter 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                matrix[i][j] = sc.nextInt();
        }

        int sum = Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();

        double avg = (double) sum / length;

        System.out.println("Matrix inputted: ");
        display(matrix);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

    }
    public static void display(int[][] arr) {
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
