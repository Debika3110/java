public class twodarraymax {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        System.out.println(max(arr));
        System.out.print(Integer.MIN_VALUE);// gives the lowest value of an integer
    }
    static int max ( int[][]arr){
        int max= arr[0][0];
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];

                }
            }

        }
        return max;

    }
}


