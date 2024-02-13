package functions;
import java.util.*;

public class Hcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a= in.nextInt();
        int b = in.nextInt();
        System.out.println(HcfOf(a, b));
    }

    static int HcfOf(int a , int b){
        int mi = Math.min(a, b);
        int fch = 0;
        for(int i = 1; i<=mi; i++){
            if(a%i==0 && b%i==0){
                fch =i;
            }
        }return fch;
    }
}
