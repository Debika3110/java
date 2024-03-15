import java.util.Scanner;
import java.util.Arrays;
public class bubble_srt {
    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
        static void bubble_sort(int[] arr){
        boolean swapped;
            for (int i = 0; i < arr.length; i++) {
                swapped=false;
                for (int j = 1; j < arr.length - i ; j++) {
                    if (arr[j] < arr[j - 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                        swapped=true;

                    }

                }
                if(!swapped);
                break;
            }
        }
}

