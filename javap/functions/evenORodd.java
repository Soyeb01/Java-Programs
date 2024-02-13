package functions;
import java.util.*;

public class evenORodd{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter a number : ");
            int num = in.nextInt();
            if(num!=0){
                System.out.println(isEven(num)+" for even");
                System.out.println(isOdd(num)+" for odd");
            }else{
                System.out.println("done");
                break;
            }
        }

    }


    static boolean isEven(int a){
        if(a%2==0){
            return true;
        }return false;
    }

    static boolean isOdd(int a){
        if(a%2!=0){
            return true;
        }return false;
    }
}   