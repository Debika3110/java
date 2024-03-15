import java.util.Scanner;

public class matrixAdd {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a[][]= new int[3][3];
        int b[][]= new int[3][3];
        int r[][]= new int[3][3];
        System.out.println("For matrix 1:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter the elements:");
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("For matrix 2:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter the elements:");
                b[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                r[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Resultant matrix is :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(r[i][j]%2==0){
                    System.out.print(0+" ");
                } else {
                    System.out.print(r[i][j]+" ");
                }
            }
            System.out.println(" ");
        }
    }
}
