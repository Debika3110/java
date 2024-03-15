import java.util.Scanner;

public class BN_in_SortedMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("enter the row size");
        int r=sc.nextInt();
        System.out.println("enter the coulmn size");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("enter the elements of the array");
        for(int i=0;i<r;i++){ // loop for row
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();*/

                int arr[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
                System.out.println("enter the element to be searched");
                int t=sc.nextInt();
                System.out.println(Search(arr,t));
            }

    static boolean Search(int arr[][],int target){
        for(int i=0;i<arr.length;i++){
            int end=arr[0].length-1;
            for(int j=0;j<=
                    end;j++){
                if(arr[i][end]==target)
                    return true;
                else if (arr[i][end]<target)
                    break;
                if(arr[i][j]==target)
                    return true;

            }
        }
        return false;
    }
}
