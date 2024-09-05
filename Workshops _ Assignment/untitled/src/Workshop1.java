import java.util.Scanner;

public class Workshop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows, columns;
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of rows: ");
        columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        // Enter 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                matrix[rows][columns] = sc.nextInt();
        }


    }
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
