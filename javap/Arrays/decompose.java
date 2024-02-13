package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class decompose {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(res(nums)));
    }

    static int[] res(int[] nums){
        int len = nums.length;
        int m=0;
        for(int i=0; i<len; i+=2){
            m=nums[i]+m;
        }
        int[] result = new int[m];
        int i=0;
        for (int j=0; j<len; j+=2){
            for(int k=0; k<nums[j]; k++){
                result[i++]=nums[j+1];  
            }
        }return result;
    }
}
