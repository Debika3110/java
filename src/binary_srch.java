import java.util.Scanner;
public class binary_srch {
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
        //int[] arr = {1, 2, 3, 4, 5, 6};
        //int t = 1;
        int ans = binarysearch(arr, t);
        System.out.println("target element found at index:"+ans);
    }

    static int binarysearch(int []arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if (target<arr[mid]) {
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}

