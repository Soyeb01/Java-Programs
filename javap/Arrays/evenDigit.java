package Arrays;

public class evenDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count =0;
        for(int i=0; i<nums.length; i++){
            if (isEven(nums[i])==true){
                count++;
            }
        }return count;
    }

    static boolean isEven(int el){
        int temp,sum=0,rem;
        temp=el;
        while(temp>0){
            rem=temp%10;
            sum++;
            temp/=10;
        }return sum%2==0;
    }
}
