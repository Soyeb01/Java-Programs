package Arrays;
import java.lang.reflect.Array;
import java.util.*;

public class names {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many names you want to enter : ");
        int a = in.nextInt();
        System.out.println("Enter names : ");
        String[] naam = new String[a];

        for (int i = 0 ; i<naam.length; i++){
            naam[i]=in.next();
        }

        System.out.println(Arrays.toString(naam));
    }
}
