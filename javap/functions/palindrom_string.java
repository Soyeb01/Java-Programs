package functions;
import java.util.*;

public class palindrom_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter a word : ");
            String rep = in.next().toLowerCase();
            if(rep.equals("done")){
                System.out.println("OK");
                break;
            }
            else if(rep.equals("done")==false){
                System.out.println(isPalindrome(rep));
            }
            // else{
            //     System.out.println("Enter a valid word");
            // } It will never work as it takes all input as a string.
        }
    }

    static boolean isPalindrome(String a) {
        int nl = a.length()-1;
        for (int i = 0 ; i<nl; i++){
            if(a.charAt(i)==a.charAt(nl-i)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    
}
