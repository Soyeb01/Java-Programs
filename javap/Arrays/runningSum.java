package Arrays;
import java.util.*;

public class runningSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many values you want to enter : ");
        int a = in.nextInt();
        int[] nums = new int[a];
        System.out.print("Enter your values : ");
        for (int i =0; i<nums.length; i++){
            nums[i]=in.nextInt();
        }
        System.out.println("Your enterd array : ");
        System.out.println(Arrays.toString(nums));
        System.out.println("Array after runsum : ");
        int[] ans = RunSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] RunSum(int[] arr){
        int sum =0;
        int[] ans = new int[arr.length];
        for(int i =0; i<arr.length; i++){
            sum=sum+arr[i];
            ans[i]=sum;
        }
        return ans;
    }
}
