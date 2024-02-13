package functions;
import java.util.*;;

public class PalindromeInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number : ");
            int a  = in.nextInt();
            System.out.println(isPalindromeInt(a));
        }
    }

    static boolean isPalindromeInt(int a){
        int temp, rem,res = 0;
        temp = a;
        while (temp>0){
            rem = temp%10;
            res = res*10 + rem;
            temp /= 10;
        }return res == a;
    }
    
}
