package Arrays;
import java.util.*;

public class permutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many values you want to enter : ");
        int a = in.nextInt();
        int[] arr = new int[a];
        System.out.print("Enter your values : ");
        for(int i = 0; i<arr.length; i++){
            arr[i]=in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int[] nums = new int[a];
        for(int i =0; i<nums.length; i++){
            nums[i] = arr[arr[i]];
        }

        System.out.println(Arrays.toString(nums));
    }
}
