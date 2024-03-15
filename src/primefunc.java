import java.util.Scanner;
public class primefunc {
    static void prime( int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                break;
            }

            if (n == 2)
                System.out.println(" is prime");
               // System.out.print(i);
             else
                System.out.print(" is not prime");

        }
    }


    public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
       int n=sc.nextInt();
       prime(n);
    }
    }

