package Arrays;

public class onefivethreenine {
    public static void main(String[] args) {
        int[] nums = {2,3,4,7,11};
        int times = 5;
        System.out.println(reami(nums, times));
    }

    static int reami(int[] nums, int times){
        int[] ans = new int[times];
        int j = 0, k=0;
        for(int i=1; i>0; i++){
            while(j>=0){
                if(nums[j]!=i){
                    ans[k]=i;
                    j++;
                    k++;
                }
            }
        }return ans[times-1];
    }
}
