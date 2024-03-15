import java.util.Scanner;

public class maxnumarr {
    public static void main(String args[]) {
        System.out.println("enter the size of an  array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d;
        d = new int[n];
       // System.out.println("enter the elements of an array");
        int max=d[0];
        System.out.println("enter the elements of an array");
        for(int i=0;i<n;i++){
            d[i]= sc.nextInt();
            if(d[i]>max)
                max=d[i];
        }

        System.out.println("the largest nymber in the array is : " +max);


    }
}
