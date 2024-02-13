package Arrays;

public class occur{
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(range(nums, target));
    }

    static int[] range(int[] nums, int target){
        int[] ans ={-1,-1};

        int start = firstoccur(nums, target, true);
        int end = firstoccur(nums, target, false);

        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    static int firstoccur(int[] arr, int target, boolean isfirst){
        int ans=-1;
        int start  = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid=start +(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                ans=mid;
                if(isfirst){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}