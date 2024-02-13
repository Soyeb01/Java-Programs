package Arrays;
import java.util.*;

public class kidsCndies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of kids : ");
        int a= in.nextInt();
        System.out.print("Extra candies you have : ");
        int extraCandies = in.nextInt();
        int[] candies = new int[a];
        System.out.print("Enter there candies : ");
        for (int i = 0; i<candies.length; i++){
            candies[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(candies));
        System.out.println(Arrays.toString(Sweetkid(candies, extraCandies)));
    }

    static boolean[] Sweetkid(int[] candies, int extraCandies) {
        int[] temp = new int[candies.length];
        for(int i = 0;i<candies.length; i++){
            temp[i]=candies[i]+extraCandies;
        }
        boolean[] result = new boolean[candies.length];
        for (int i = 0; i<candies.length; i++){
            for(int j = 0; j<candies.length;j++){
                if(temp[j]<candies[i]){
                    result[i]=false;
                    break;
                }else{
                    result[i]=true;
                }
            }
        }return result;
    }

}
