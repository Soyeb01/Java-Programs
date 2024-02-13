package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class add{
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int tel = 123;
        System.out.println(Arrays.toString(addArr(nums, tel)));
    }

    static int[] addArr(int[] arr, int k){
        int temp,sum=0,rem;
        int n = arr.length;
        temp=k;
        while(temp>0){
            rem=temp%10;
            sum= sum +arr[n-1]+rem;
            temp/=10;
            if(sum>10 && n==0){
                arr[n-1]=sum%10;
                sum=1;
            }
            else{
                arr[n-1]=sum;
                sum=0;
            }
            n--;
        }return arr;
    }
}