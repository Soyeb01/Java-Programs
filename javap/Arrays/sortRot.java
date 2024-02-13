package Arrays;

public class sortRot {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int piv = pivot(nums);
        boolean first = chkRotated(nums, 0, piv);
        boolean last = chkRotated(nums, piv+1, nums.length);
        System.out.println(first==true&&last==true?true:false);
    }

    static boolean chkRotated(int[] nums, int start, int end){
        boolean ans=true;
        for(int i =start; i<end; i++){
            if(nums[i]>nums[i++]){
                return false;
            }
        }return ans;
    }

    static int pivot(int[] nums){
        int start=0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }else if(nums[mid]==nums[start]){
                start=mid+1;
            }
            else if(nums[mid]<nums[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return start-1;
    }
}
