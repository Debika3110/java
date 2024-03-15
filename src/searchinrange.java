public class searchinrange {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 65, 98, 90, 4, 2, 13};
        int start = 4;
        int end = 8;
        int target = 13;
        System.out.println(range(arr,start,end,target));
    }

    static int range(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

}


