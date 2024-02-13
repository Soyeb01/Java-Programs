package Arrays;

import java.util.Arrays;

public class parutyII {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        int corr = 0, i=0;
        boolean chk=false;
        while(i<nums.length){
            if(chk==true && i%2==0){
                i++;
            }
            else if(nums[i]%2==0 && corr<nums.length){
                int temp=nums[corr];
                nums[corr]=nums[i];
                nums[i]=temp;
                corr+=2;
                chk=true;
            }else{
                i++;
            }
        }System.out.println(Arrays.toString(nums));
    }
}
