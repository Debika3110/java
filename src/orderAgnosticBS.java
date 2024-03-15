import java.util.Scanner;

public class orderAgnosticBS {
    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target elements");
        int t=sc.nextInt();
        int ans = orderAgnostic(arr, t);
        System.out.println("target element found at index:"+ans);
    }
    static int orderAgnostic(int [] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //find weather the array is sorted or not
        boolean isace = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isace) {
                if (target<arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target>arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
