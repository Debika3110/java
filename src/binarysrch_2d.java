import java.util.Arrays;
import java.util.Scanner;

public class binarysrch_2d {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row size");
        int r=sc.nextInt();
        System.out.println("enter the coulmn size");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("enter the elements of the array");
        for(int i=0;i<r;i++){ // loop for row
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        /*int arr[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };*/
        System.out.println("enter the element to be searched");
        int t=sc.nextInt();
        System.out.println(Arrays.toString(search(arr,t)));
    }
    static int[] search(int arr[][],int target){
        int r=0;
        int c=arr.length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};

    }
}
