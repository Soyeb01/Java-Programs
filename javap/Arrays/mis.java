package Arrays;

import java.util.Arrays;

public class mis {
    public static void main(String[] args) {
        int[] nums = {2,3,1};
        int start=0,end=nums.length-1,sum=0;
        int mid=start+(end-start)/2;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j!=0; j--){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0; i<nums.length; i++){
            int mel = nums[mid]-nums[i];
            if(mel<0){
                mel=-1*mel;
            }
            sum=sum+mel;
        }System.out.println(sum);
    }
}
