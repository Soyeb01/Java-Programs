package Arrays;
import java.util.*;

public class shuffle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of values only in 2*n : ");
        int a = in.nextInt();
        int[] nums = new int[a];
        System.out.print("Enter your values : ");
        for (int i =0; i<nums.length; i++){
            nums[i]=in.nextInt();
        }
        System.out.println("Your enterd data : ");
        System.out.println(Arrays.toString(nums));

        int[] ans = shuffled(nums);
        System.out.println("Your shuffled array is : ");
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffled(int[] arr){
        int[] and = new int[arr.length];
        for(int i = 0 ;i<arr.length;i++){
            if(i%2==0){
                and[i]=arr[i/2];
            }else{
                and[i]=arr[(arr.length/2)+i/2];
            }
        }return and;
    }
}
