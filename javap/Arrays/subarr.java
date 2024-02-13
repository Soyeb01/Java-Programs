package Arrays;

public class subarr {
    public static void main(String[] args) {
        int[] nums = {23,2,6,4,7};
        int k=2;
        System.out.println(checkSubarraySum(nums, k));
    }

    static boolean checkSubarraySum(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            int sum=0;
            for(int j=i; j<nums.length-1; j+=2){
                sum=sum+nums[j]+nums[j+1];
                if(sum%k==0){
                    return true;
                }
            }
        }return false;
    }
}
