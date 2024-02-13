package Arrays;

public class placeOccur {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 0;
        System.out.println(Occ(nums, target));
    }

    static int Occ(int[] num, int target){
        int start =0;
        int n= num.length;
        int end=n-1;
        int mid;
        while(start<=end){
            mid= start+(end-start)/2;
            if(num[mid]>target){
                end=mid-1;
            }else if(num[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start==n-2? start+1:start;
    }
}
