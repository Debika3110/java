import java.util.Scanner;
public class transposeMatrix {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a[][]= new int[3][3];
        int r[][]= new int[3][3];
        System.out.println("Matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter the elements:");
                a[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                r[i][j] = a[j][i];
            }
        }
        System.out.println("Transpose Matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(r[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
