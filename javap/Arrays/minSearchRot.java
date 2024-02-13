package Arrays;

public class minSearchRot {
    public static void main(String[] args) {
        int[] nums= {1,1,2,2,2,4};
        int piv = pivotPoint(nums);
        System.out.println(piv);
        int ans = piv<nums.length-1?nums[piv+1]:nums[0];
        System.out.println(ans);
    }
    
    static int pivotPoint(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }else if(mid>start && nums[mid-1]>nums[mid]){
                return mid-1;
            }if(mid>start && nums[mid]<nums[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return end;
    }
}
