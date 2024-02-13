package Arrays;

public class percent {
    public static void main(String[] args) {
        int[] arr = {5,5,7,7,7,7,8,8,8,10};
        int target;
    }

    static float range(int[] nums, int target){
        float count=0f;
        int[] ans ={-1,-1};

        ans[0] = firstoccur(nums, target, true);
        ans[1]= firstoccur(nums, target, false);

        for(int i=ans[0]; i<=ans[1]; i++){
            count++;
        }
        return count*(0.25f);
    }

    static int firstoccur(int[] nums, int target, boolean isFirt){
        int ans=-1;
        int start =0;
        int end=nums.length-1;
        int mid;
        while(start<end){
            mid = start+(end-start)/2;
            if(nums[mid]>nums[target]){
                end=mid-1;
            }else if(nums[mid]<nums[target]){
                start=mid+1;
            }else {
                ans=mid;
                if(isFirt=true){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }return ans;
    }
}
