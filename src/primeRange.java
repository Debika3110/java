import java.util.Scanner;
public class primeRange {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int start,end,i,j;
        boolean flag;
        System.out.println("enter the starting and ending numbers");
        start=input.nextInt();
        end=input.nextInt();
            for(i=start;i<end;i++){
                int temp=i;
                flag=true;
                for(j=2;j<temp;j++){
                    if(temp%j==0){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    System.out.print(" "+temp);
                }
            }
    }

}
