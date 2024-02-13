package functions;
import java.util.*;
public class Functions {
    /*public static int fac(int a){
        int fact = 1;
        for(int i=a ; i>=1; i--){
            fact = fact*i;
        }
        return fact;
    }*/
    /*public static void table(int a){
        for (int i = 1; i<=10; i++){
            System.out.println(a*i);
        }
    }*/

    /*public static int calSumOdd(int a){
        int sum = 0;

        for (int i = 1; i<=a; i++){
            if (i%2!=0){
                sum= sum+i;
            }else{
                continue;
            }
        }
        return sum;
    }*/

    /*public static float circum(float a) {
        final float pie = 3.14f;
        return 2*pie*a;
    }*/

    /*public static void age(int a) {
        if (a>=18) {
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not eligible for vote");
        }
    }*/


    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int l = sc.nextInt();

        age(l);
    }*/


    /*public static void main(String[] args) {
        int a = 2;
        do {
            System.out.println(a++);
        } while (a>1);
    }*/

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int l = sc.nextInt();

        System.out.println("Your Fibonicci series is ");
        int m = 0;
        int n = 1;
        System.out.print(n+" ");
        for (int i = 1; i<=l; i++){
            int p =m+n;
            System.out.print(p+" ");
            m=n;
            n=p;
        }
    }*/

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much entries you want: ");
        int n = sc.nextInt();
        int[] number = new int[n];

        System.out.println("Enter your entries :");
        for (int i =0; i<n; i++){
            number[i] = sc.nextInt();
        }

        System.out.println("Which number's memory you want to find :");
        int m = sc.nextInt();

        for (int j = 0 ; j<n; j++){
            if(number[j]==m){
                System.out.println("Your location is : "+j);
            }
        }
        
    }*/

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many names you want to entre : ");
        int n = sc.nextInt();

        String[] names = new String[n];

        System.out.println("Enter names : ");

        for (int i = 0; i<n; i++){
            names[i] = sc.next();
        }

        for (int j = 0; j<n; j++){
            System.out.println("Your names are : "+ names[j]);
        }
    }*/

    /*public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many numbers you want to enter : ");
        int n = sc.nextInt();
        
        int[] number = new int[n];
        
        System.out.println("Enter numbers : ");
        
        for (int i = 0; i<n; i++){
            number[i] = sc.nextInt();
        }
        
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        
        for (int j = 0; j<n; j++){
            if(number[j]>max){
                max = number[j];
                
            }if ( number[j]<min){
                min = number[j];
                
            }
        }
        System.out.println("Your maximum number is : "+max);
        System.out.println( "Minimum number is : "+min);
    }*/

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to enter : ");
        int n = sc.nextInt();
        
        int[] number = new int[n];
        
        System.out.println("Enter numbers : ");
        
        for (int i = 0; i<number.length; i++){
            number[i] = sc.nextInt();
        }

        boolean isAsc = true;

        for (int j = 0 ; j<number.length-1; j++){
            if (number[j]>number[j+1]){
                isAsc = false;
            }
        }
        if(isAsc){
            System.out.println("Array is in asc");
        }else{
            System.out.println("Array is not in asc");
        }
    
    }*/

    /*
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows you want :");
        int row = sc.nextInt();
        System.out.println("Enter how many columns you want :");
        int col = sc.nextInt();

        int[][] mat = new int[row][col];

        System.out.println("Enter your entries");

        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                mat[i][j]  = sc.nextInt();
            }
        }

        System.out.println("Your matrics is :");
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Which number you wanna find :");
        int n = sc.nextInt();

        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                if(mat[i][j] == n){
                    System.out.println(n+" is in "+ (i+1) +" row "+(j+1) +" column");
                }
            }
        }
    }*/

    /*static int HcfOf(int a, int b) {
        int mi = Math.min(a,b);
        int gcd = 0;
        for (int i = 1; i<=mi; i++){
            if (a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }*/
}
