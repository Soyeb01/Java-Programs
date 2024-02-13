package Arrays;

import java.util.Arrays;

public class target {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int n= nums.length;
        int[] target  = new int[n];
        for(int i=0; i<nums.length; i++){
            for(int j=n-1; j>index[i]; j--){
                target[j]=target[j-1];
            }target[index[i]]=nums[i];
        }return target;
    }
}
