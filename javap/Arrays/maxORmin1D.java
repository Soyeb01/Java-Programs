package Arrays;
import java.util.*;

public class maxORmin1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers you want to enter : ");
        int a= in.nextInt();
        System.out.println("Enter your numbers : ");
        int[] num = new int[a];
        for(int i = 0; i<num.length; i++){
            num[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(num));
        System.out.println("Maximum number is : " + maximum(num));
        System.out.println("Minimum number is : " + minimum(num));

    }

    static int maximum(int[] arr){
        int temp = arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }return temp;
    }

    static int minimum(int[] arr){
        int temp = arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]<temp){
                temp=arr[i];
            }
        }return temp;
    }
}
