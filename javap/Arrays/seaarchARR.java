package Arrays;

public class seaarchARR {
    public static void main(String[] args) {
        int[] nums = {5,1,3};
        int target = 1;
        int len =nums.length;
        int piv = pivotPoint(nums);
        System.out.println(piv);
        if(nums[0]>target){
            for(int i=piv+1; i<len ; i++){
                if(nums[i]==target){
                    System.out.println(i);;
                }
            }
        }else{
            for(int i=0; i<piv+1 ; i++){
                if(nums[i]==target){
                    System.out.println(i);;
                }
            }
        }System.out.println(-1);;
    }
    
    static int pivotPoint(int[] nums){
        int len = nums.length;
        int start = 0;
        int end = len-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }if(mid>start && nums[mid-1]>nums[mid]){
                return mid-1;
            }if(mid>start && nums[mid]<nums[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return end;
    }
}
