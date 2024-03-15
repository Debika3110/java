import java.util.Scanner;

public class circlefunc {
    static void circle (float r){
        double area = 3.14*r*r;
        double circm= 2*3.14*r;
        System.out.println(" the area of the circle is :"+area);
        System.out.println("the circumference of the circle is :"+circm);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the radius");
        float r= sc.nextFloat();
        circle(r);

    }
}
