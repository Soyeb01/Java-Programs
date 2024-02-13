package Arrays;

public class negativeFound {
    public static void main(String[] args) {
        int[][] num ={{3,2,0},{-1,-1,-2}};
        int n = num.length;
        int sum=0;
        for(int i=0; i<n; i++){
            int[] grid = num[i];
            sum=sum+binarySearch(grid);
        }
        System.out.println(sum);
    }

    static int binarySearch(int[] arr){
        int ans =0;
        int n= arr.length;
        int mid,start=0, end=n-1, target=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]>target){
                start=mid+1;
            }
            else if(arr[mid]<target){
                end=mid-1;
            }
            else{
                if(mid>0 && arr[mid-1]==target){
                    end=mid-1;
                }else{
                    start=mid;
                    break;
                }
            }
        }
        for(int i = start; i<n; i++){
            ans++;
        }
        return ans;
    }
}
