//import java.util.Scanner;
//
//public class arraySum {
//    public static void main(String args[]){
//        Scanner input = new Scanner(System.in);
//        int n, i, j;
//        System.out.print("Enter the size of the array:");
//        n = input.nextInt();
//        int arr[] = new int[n];
//        System.out.println("Enter the elements of the array:");
//        for (i = 0; i < n; i++) {
//            arr[i] = input.nextInt();
//        }
//        int s,sum=0,flag=0;
//                for(i=0;i<n;i++) {
//            sum = arr[i];
//            for (j = i + 1; j < n; j++) {
//                sum += arr[j];
//                flag = 0;
//                if (sum == s) {
//                    System.out.println((i + 1) + " " + (j + 1));
//                    flag = 1;
//                } else if (sum > s) {
//                    break;
//                }
//            }
//        }
//    }
//}

