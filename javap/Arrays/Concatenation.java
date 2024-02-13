package Arrays;
import java.util.*;

public class Concatenation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many values you want to enter : ");
        int a = in.nextInt();
        int[] nums = new int[a];
        System.out.print("Enter your values : ");
        for(int i=0; i<nums.length; i++){
            nums[i]=in.nextInt();
        }
        System.out.println("Your entered array : ");
        System.out.println(Arrays.toString(nums));

        int[] numsUp = new int[a+a];
        int cnt =0;
        for(int i = 0; i<numsUp.length; i++){
            if(i<nums.length){
                numsUp[i]=nums[i];
            }else if(i>=nums.length){
                while(true){
                    numsUp[i]=nums[cnt];
                    cnt++;
                    break;
                }
            }
        }

        System.out.println("Your array after concatenation : ");
        System.out.println(Arrays.toString(numsUp));
    }
}
