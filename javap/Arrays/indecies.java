package Arrays;

import java.util.Arrays;

public class indecies {

    public static void main(String[] args) {
        int[] nums = {36,45,32,31,15,41,9,46,36,6,15,16,33,26,27,31,44,34};
        System.out.println(Arrays.toString(sortEvenOdd(nums)));
    }
    static int[] sortEvenOdd(int[] nums) {
        for(int i =0; i<nums.length; i++){
            if(i%2==0){
                int minIdx = index(nums,i ,  true);
                swap(nums, i, minIdx );
            }else{
                int maxIdx = index(nums, i, false);
                swap(nums, i, maxIdx);
            }
        }return nums;
    }
    
    static int index(int[] arr, int start, boolean chk){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE,ans=-1;
        
        for(int i=start; i<arr.length; i+=2){
            if(chk==true){
                if(min>arr[i]){
                    min=arr[i];
                    ans=i;
                }
            }else{
                if(max<arr[i]){
                    max=arr[i];
                    ans=i;
                }
            }
        }return ans;
    }
    
    static int[] swap(int[] arr, int high, int low){
        int temp = arr[high];
        arr[high]=arr[low];
        arr[low]=temp;
        return arr;
    }
}
