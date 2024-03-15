public class mininumbr {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        System.out.println(mini(arr));
    }
    static int mini(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            //int min=arr[0];
            if(arr[i]<min){
                min=arr[i];
                //return min;
            }
        }
        return min;
    }
}
