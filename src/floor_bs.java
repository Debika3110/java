import java.util.Scanner;

public class floor_bs {public static void main(String[] args) {
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
    int ans = ceiling(arr, t);
    System.out.println("target element found at index:"+ans);
}

    static int ceiling(int []arr, int target) {
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
        return end;
    }

}

