package Arrays;
import java.util.*;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many account you want to enter : ");
        int a = in.nextInt();
        System.out.print("Enter how many wealth th account holds : ");
        int b = in.nextInt();
        int[][] account = new int[a][b];
        System.out.print("Enter your values : ");
        for (int i =0; i<account.length; i++){
            for (int j =0; j<account[i].length; j++){
                account[i][j]=in.nextInt();
            }
        }
        System.out.println("Your enterd data : ");
        for(int i = 0; i<account.length; i++){
            System.out.println(Arrays.toString(account[i]));
        }
        System.out.println("The richest customer has wealth of : ");
        System.out.println(chkWealth(account));

    }

    static int chkWealth(int[][] arr){
        int max=0;
        int[] we=new int[arr.length];
        for (int i =0; i<arr.length; i++){
            int sum=0;
            for(int j =0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            we[i]=sum;
        }
        for(int i = 0;i<we.length;i++){
            if(we[i]>max){
                max=we[i];
            }
        }
        return max;
    }
}
