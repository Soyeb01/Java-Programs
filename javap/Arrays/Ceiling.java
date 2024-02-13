package Arrays;
import java.util.*;

public class Ceiling{
    public static void main(String[] args) {
        int[] nums= {2,3,5,9,14,16,18};
        int target = 4;
        System.out.println(chk(nums,target));
    }

    static int chk(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                return nums[mid];
            }
        }return nums[start];
    }
}