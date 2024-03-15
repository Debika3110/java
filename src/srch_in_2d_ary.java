import java.util.Arrays;
import java.util.Scanner;
public class srch_in_2d_ary {
    public static void main(String[] args) {
        System.out.println("enter the size of 2D array");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int arr[][] = new int [row][column];
        System.out.println("enter the elements of the array");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the target element");
        int target = sc.nextInt();
        int ans=search(arr,target);
        System.out.println(Arrays.toString(new int []{ans}));
    }
    public static int search(int arr[][],int target){
        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
                if(arr[row][column]== target){
                    return 1;
                }
            }

            }
        return -1;

    }

}
