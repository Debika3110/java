import java.util.Scanner;
import java.util.Arrays;
public class merging_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st array size");
        int n=sc.nextInt();
        System.out.println("enter the 1st array");
        int []arr1=new int[n];
        System.out.println("enter 2st array size");
        int m=sc.nextInt();
        System.out.println("enter the 2st array");
        int []arr2=new int[m];
        int s=m+n;
        int[]merg=new int[s];
        System.arraycopy(arr1,0,merg,0,n);
        System.arraycopy(arr2,0,merg,n+1,m);
        System.out.println("the merge array is");
        System.out.println(Arrays.toString(merg));
    }
}
