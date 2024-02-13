package Arrays;
import java.util.*;

public class SearchTwoD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int a= in.nextInt();
        System.out.print("Enter number of columns :");
        int b = in.nextInt();
        int[][] num = new int[a][b];
        System.out.print("Enter your values : ");
        for (int i = 0; i<num.length; i++){
            for(int j= 0; j<num[i].length; j++){
                num[i][j]=in.nextInt();
            }
        }
        System.out.print("Which number you want to find : ");
        int n = in.nextInt();
        
        for(int i= 0; i<num.length; i++){
            for(int j =0;j<num[i].length;j++){
                if(num[i][j]==n){
                    System.out.println(a+" is in "+(i+1)+" row and "+(j+1)+" column");
                }
            }
        }
    }
}
