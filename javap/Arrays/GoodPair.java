package Arrays;
import java.util.*;

public class GoodPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many number you want to enter : ");
        int a = in.nextInt();
        System.out.println("Enter numbers : ");
        int[] nums = new int[a];
        for (int i = 0 ; i<nums.length; i++){
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("There are "+numIdenticalPairs(nums)+" good pairs.");
    }

    static int numIdenticalPairs(int[] arr){
        int count=0;
        for(int i  = 0; i<arr.length;i++){
            for(int j= 0;j<arr.length;j++){
                if(i<j){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
