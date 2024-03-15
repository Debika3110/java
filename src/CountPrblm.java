import java.util.*;

public class CountPrblm {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = input.nextInt();

        int count = 0;
        Arrays.sort(nums);

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = nums[i] + nums[j];
                if (Arrays.binarySearch(nums, temp) > 0) {
                    count+=1;
                }
            }
        }

        System.out.println(count);
    }
}
