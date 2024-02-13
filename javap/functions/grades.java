package functions;
import java.util.*;

public class grades {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0,a;
        for(int i = 1; i<=5 ; i++){
            System.out.print("Enter your marks : ");
            a = in.nextInt();
            total = total + a;
        }
        int per = total/5;
        gradeSystem(per);

    }

    static void gradeSystem(int a){
        int cg = a/10;
        switch (cg){
            case 9 -> System.out.println("Your grades are : AA");
            case 8 -> System.out.println("Your grades are : AB");
            case 7 -> System.out.println("Your grades are : BB");
            case 6 -> System.out.println("Your grades are : BC");
            case 5 -> System.out.println("Your grades are : CD");
            case 4 -> System.out.println("Your grades are : DD");
            case 3,2,1,0 -> System.out.println("Yo are fail");
        }
    }
}
