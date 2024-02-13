package Arrays;
import java.util.Arrays;

public class addone {
    public static void main(String[] args) {
        int[] num = {9,9,9,9};
        System.out.println(Arrays.toString(plusOne(num)));
    }

    static int[] plusOne(int[] digits) {
        int n = digits.length;
        int m, count=0;
        for(int i=0; i<n; i++){
            if(digits[i]==9){
                count++;
            }
        }
        if(count==n){
            m=n+1;
        }else{
            m=n;
        }
        int[] ans = new int[m];
        int sum=1;
        while(n>0){
            sum= sum +digits[n-1];
            if(sum>9 && (n-1)==0){
                ans[1]=sum%10;
                ans[0]=1;
                return ans;
            }
            else if(sum>9){
                ans[m-1]=sum%10;
                sum=1;
            }
            else{
                ans[m-1]=sum;
                sum=0;
            }
            n--;
            m--;
        }return ans;
    }
}
