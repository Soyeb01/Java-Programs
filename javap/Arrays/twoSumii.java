package Arrays;
import java.util.Arrays;

public class twoSumii {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,9};
        int target =9;
        System.out.println(Arrays.toString(res(nums, target)));
    }

    static int[] res (int[] nums, int target){
        if(nums.length==2){
            return new int[]{1,2};
        }
        int end = bs(nums, target);
        for(int i=0; i<end; i++){
            for(int j=i+1; j<end; j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i+1, j+1};
                }
            }
        }return new int[] {-1, -1};
    }

    static int bs(int[] nums, int target){
        int start=0;
        int end= nums.length -1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(mid<end && nums[mid]<target && nums[mid+1]>target){
                return mid+1;
            }else if(mid>start && nums[mid]>target && nums[mid-1]<target){
                return mid;
            }
            if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                end= mid+1;
            }else{
                return mid+1;
            }
        }return -1;
    }
}
