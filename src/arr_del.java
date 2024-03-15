import java.util.Scanner;
public class arr_del {
    public static void main(String[] args) {
       System.out.println("enter the array size");
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //int arr[]={1,2,3,4,5};
        System.out.println("enter the position  ");
        int pos=sc.nextInt();
        //int pos=2;
        for(int i=pos;i<n-1;i++)
        {
            arr[i] = arr[i + 1];

        }
       for(int i=0;i<n-1;i++) {
           System.out.print(arr[i] + " ");
       }
    }
}
