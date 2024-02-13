package Arrays;
import java.util.Arrays;

public class mergeSorted{
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int m = 3,n = 3;
        int[] nums2 = {1,2,3};
        System.out.println(Arrays.toString(mergedarr(nums1,m,nums2,n)));
    }

    static int[] mergedarr(int[] nums1, int m, int[] nums2, int n){
        int j=0;
        for(int i=m; i<m+n; i++){
            nums1[i]=nums2[j++];
        }
        return sorted(nums1);
    }

    static int[] sorted(int[] arr){
        boolean noSwap;
        int len=arr.length;
        for(int i=0; i<len-1; i++){
            noSwap=true;
            for(int j=0; j<len-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    noSwap=false;
                }System.out.println(arr[j]);
            }if(noSwap==true){
                    break;
                }
        }return arr;
    }
}