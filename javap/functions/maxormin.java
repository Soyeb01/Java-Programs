package functions;
import java.util.*;

public class maxormin {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(max(a,b,c)+" is the largest one");
        System.out.println(min(a,b,c)+" is the smallest one");
    }

    static int max(int l, int m, int n){
        int mac = (l>m)?l:m;
        int res = (mac>n)?mac:n;
        return res;
    }

    static int min(int l,int m, int n){
        int mil = Math.min(l, m);
        int res = Math.min(mil, n);
        return res;
    }
}