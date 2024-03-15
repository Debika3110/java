import java.util.Arrays;
import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {

        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int arr[]){
        int temp;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
