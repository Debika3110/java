import java.util.Scanner;

public class arr_insrt {
    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the position  ");
        int pos = sc.nextInt();
        System.out.println("enter the element to be entered  ");
        int element = sc.nextInt();
        for (int i=n-1;i>=pos-1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos-1] = element;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr[n]);
    }
}
