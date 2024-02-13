package Arrays;
import java.util.*;

public class sortedNumberes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers you want to enter : ");
        int a= in.nextInt();
        System.out.println("Enter your numbers : ");
        int[] num = new int[a];
        for(int i = 0; i<num.length; i++){
            num[i]=in.nextInt();
        }
        System.out.println(isSorted(num));
    }

    static boolean isSorted(int[] arr){
        int cnt = 0;
        boolean chk = false;
        while(cnt<arr.length-1){
            if(arr[cnt]<arr[cnt+1]){
                chk=true;
                cnt++;
            }else{
                chk= false;
                break;
            }
        }
        return chk;
    }
}
