package Arrays;
import java.util.*;

public class twoD {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("How many rows and columns you want : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] num = new int[a][b];
        System.out.println("Enter numbers : ");

        for(int i = 0 ; i<num.length; i++){
            for(int j = 0 ; j<num[i].length; j++){
                num[i][j]=in.nextInt();
            }
        }

        for(int i = 0 ; i<num.length; i++){
            System.out.println(Arrays.toString(num[i]));
        }
    }
}
