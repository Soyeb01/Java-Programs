package functions;
import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter number : ");
            int a = in.nextInt();
            System.out.println(SumTo(a));
        }
        
    }

    static int SumTo(int a){
        int sum=0;
        for(int i = 1; i<=a; i++){
            sum = sum+i;
        }return sum;
    }
}
