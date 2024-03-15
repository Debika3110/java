import java.util.Scanner;

public class reverse_array {

    public static void main(String args[]) {
        System.out.println("enter the size of an  array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d;
        d = new int[n];
        System.out.println("the original array is");
        for(int i=0;i<n;i++){
            d[i]=sc.nextInt();
        }
        System.out.println("the reverse array is :");
        for(int i=n-1;i>=0;i--){
            System.out.print( d[i] +" ");
        }
    }
}
