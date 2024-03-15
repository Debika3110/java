import java.util.Scanner;

public class arrayS {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n, i, j;
        System.out.print("Enter the size of the array:");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Elements of the unsorted array are:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int index;
        for (i = 0; i < n - 1; i++) {
            index = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        System.out.println("\nElements of the sorted array are:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
