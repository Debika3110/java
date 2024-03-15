public class frequency {
    public static void countfreq(int arr[],int n){
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==true)
                continue;
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println("---------------------------");
            System.out.println("element           frequency");
            System.out.println("---------------------------");
            System.out.println(" "+arr[i]+"                   "+count);
        }
    }
    public static void main(String[] args){
        int arr[]=new int[]{ 10,20,20,10,10,20};
        int n = arr.length;
        countfreq(arr,n);

    }
}
