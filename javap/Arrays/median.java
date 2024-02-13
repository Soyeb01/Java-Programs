package Arrays;

import java.util.Arrays;

public class median {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        int m = nums1.length;
        int n = nums2.length;
        int len = m+n;
        int[] merg = new int[len];
        int j =0, i=0;
        while(j<len){
            if(j<m){
                merg[j]=nums1[j];
            }else{
                merg[j]=nums2[i];
                i++;
            }j++;
        }
        System.out.println(Arrays.toString(merg));
        
        for(int k=0; k<len-1; k++){
            for(int l=0; l<len-k-1; l++){
                if(merg[l]>merg[l+1]){
                    int temp=merg[l];
                    merg[l]=merg[l+1];
                    merg[l+1]=temp;
                }System.out.println(merg[l]);
            }
        }
        System.out.println(Arrays.toString(merg));
        if((len-1)%2==0){
            System.out.println((double)merg[(len-1)/2]);
        }
        System.out.println((double)(merg[(len-1)/2]+merg[((len-1)/2)+1])/2);
    }
}
