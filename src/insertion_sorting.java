import java.util.Arrays;
import java.util.Scanner;

public class insertion_sorting {
    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }

    }
    static void swap(int[]arr,int first,int second){
        int temp;
        temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
