import java.util.Scanner;

public class smallestletter_BS {
    public static void main(String[] args) {
    System.out.println("enter the array size");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("enter the array elements");
    char arr[]=new char[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.next().charAt(0);
    }
    System.out.println("enter the target elements");
    char t=sc.next().charAt(0);
    char ans = letter(arr, t);
    System.out.println(ans);
    }

    static char letter(char []arr, char target) {
        if(target>arr.length){
            return arr[0];
        }
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if (target<arr[mid]) {
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}





