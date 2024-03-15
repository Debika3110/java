public class mountain_ary {
    public static void main(String[] args) {
        /*System.out.println("enter the array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(peak_value(arr));*/
        int[] arr = { 1, 3, 6, 5, 4};
        System.out.println(peak_value(arr));
    }
    static int peak_value(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+end/2;
            if (arr[mid] > arr[mid+1]) {
                //you are in the decreasing part of the array
                //this can be the ans but lets look for more possible result in the array
                //this is way end is not =mid-1
                end=mid;
            }
            else{
                start=mid+1;//because we know that mid+1 element is greater than mid element
            }
        }
        //in the end , both start and end are poiting towords the greatest elements so we can print either of then
        return end;
    }
}
