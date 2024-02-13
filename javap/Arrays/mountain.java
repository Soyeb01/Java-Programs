package Arrays;
import java.util.*;

public class mountain{
    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        System.out.println(findpeek(nums));
    }
    
    static int findpeek(int[] arr){
        int start=0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid<end && arr[mid]<arr[mid+1]){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }return start;
    }
}

