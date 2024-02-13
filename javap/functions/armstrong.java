package functions;
import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();
        System.out.println(isArms(a));
    }
    
    static boolean isArms(int k){
        int temp,rem, total = 0;
        temp = k;
        while(temp>0){
            rem = temp%10;
            total = total + rem*rem*rem;
            temp/=10;
        }
        return total == k;
    }
}
