package functions;
import java.util.*;

public class Lcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(LcmOf(a, b));

    }

    static int LcmOf(int a,int b){
        int ma = Math.max(a, b);
        int mcl = 0;
        for(int i = ma; i>=ma ; i++){
            if(i%a==0 && i%b==0){
                mcl=i;
                break;
            }
        }return mcl;
    }
}
