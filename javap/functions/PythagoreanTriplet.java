package functions;
import java.util.*;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter the numbers : ");
            double a = in.nextInt();
            double b = in.nextInt();
            double c = in.nextInt();
            System.out.println(isPythagoreantriplet(a,b,c));
        }
    }

    static boolean isPythagoreantriplet(double a, double b, Double c){
        double max = Math.max(c,(Math.max(a, b)));
        return Math.pow(max,2) == Math.pow(a, 2) + Math.pow(b, 2);
    }
}
