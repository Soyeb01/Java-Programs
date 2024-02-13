package functions;
import java.util.*;;

public class facto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter number : ");
            int a= in.nextInt();
            System.out.println(Factorial(a));
        }
    }
    
    static int Factorial(int a){
        if(a==0){
            return 1;
        }
        int temp=1,result;
        for(int i = 1 ; i<=a ; i++){
            result = temp*i;
            temp = result;
        }return temp;
    }
}
