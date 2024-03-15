import java.util.Scanner;
public class votewidfunc {
    static void vote(int age) {
        if (age >= 18)
            System.out.println("eligible to vote");
        else
            System.out.println(" not eligible to vote");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        vote(age);
    }
}



