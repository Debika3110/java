import java.util.Scanner;
public class linearscrh {
    public static void main(String args[]) {
        System.out.println("enter the size of an  array");
        // System.out.println(" enter the element to be searched");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" enter the element to be searched");
        int m = sc.nextInt();
        int[] d;
        d = new int[n];
        System.out.println("enter the array elements ");
        for (int index = 0; index < n; index++) {
            d[index] = sc.nextInt();
            int elements = d[index];
            if (elements == m) {
                System.out.println(" elements  found :" + m);
            }
            else{
                System.out.println(" elements  not found ");
            }
        }
    }
}





