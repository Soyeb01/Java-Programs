package functions;
import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter number : ");
            int a = in.nextInt();
            if(a<2){
                System.out.println("None");
            }else if(a>=2){
                System.out.println(isPrime(a));
            }
        }
    }

    static boolean isPrime(int a){
        int cnt =0;
        for(int i= 1; i<=a; i++){
            if(a%i==0){
                cnt++;
            }
        }
        return cnt==2;
    }
}
