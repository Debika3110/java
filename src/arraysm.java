import java.util.Scanner;
public class arraysm {
    public static void main(String args[]){
        System.out.println( "enter the size of an  array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d;
        d = new int[n];

        int sum = 0;
        System.out.println("enter the array elements ");
        for(int i = 0 ; i < n; i ++){
            d[i]= sc.nextInt();
            sum = sum + d[i];
        }
        System.out.println(sum);






    }

}
