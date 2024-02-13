package Arrays;

public class tfPer {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        int len =arr.length;

        for(int i=0; i<len; i++){
            if(arr[i]==arr[i+1]){
                int l = lastoccur(arr, i, len-1, arr[i]);
                if((float)(l+1)-(float)(i)>(float)len/4){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

    static int lastoccur(int[] nums, int start, int end, int target){
        int ans =-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]==target){
                ans = mid;
                if(mid+1<nums.length && nums[mid+1]==target){
                    start=mid+1;
                    continue;
                }break;
            }
        }return ans;
    }
}
