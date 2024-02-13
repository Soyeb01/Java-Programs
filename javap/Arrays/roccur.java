package Arrays;

public class roccur {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }

    static int search(int[] nums, int target) {
        int l = nums.length;
        int piv = findPivot(nums);
        if(nums[0]>target){
            return found(nums, piv+1, l-1, target);
        }else if(nums[0]<target){
            return found(nums, 0, piv+1, target);
        }
        return 0;
    }
    
    static int findPivot(int[] arr){
        int start=0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(mid>start && arr[mid]<arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return end;
    }
    
    static int found(int[] nums, int start, int end, int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }return -1;
    }
}
