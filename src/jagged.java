import java.util.Scanner;

public class jagged {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for the number of rows in the jagged array
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        // Creating the jagged array
        int[][] jaggedArray = new int[rows][];

        // Populating the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            int cols = input.nextInt();
            jaggedArray[i] = new int[cols];

            System.out.println("Enter the elements for row " + (i + 1) + ":");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = input.nextInt();
            }
        }

        // Displaying the jagged array
        System.out.println("The jagged array entered is:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Closing the scanner
        input.close();
    }
}
