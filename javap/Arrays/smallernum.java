package Arrays;
import java.util.*;

public class smallernum {
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
        System.out.println(Arrays.toString(chkSmaller(nums)));
    }

    static int[] chkSmaller(int[] arr){
        int[] result = new int[arr.length];
        for(int i  = 0; i<arr.length;i++){
            int count=0;
            for(int j= 0;j<arr.length;j++){
                if(j!=i){
                    if(arr[j]<arr[i]){
                        count++;
                    }
                }
            }result[i]=count;
        }
        return result;
    }
}
