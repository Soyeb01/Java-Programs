package patterns;

public class base {
    public static void main(String[] args) {
        bit_triangle(5);
    }

    private static void bit_triangle(int n) {
        for(int i=1; i<=n; i++){
            int bit = i%2==0?0:1;
            for(int j=1; j<=i; j++){
                System.out.print(bit+" ");
                bit=bit^1;
            }System.out.println();
        }
    }

    static void num_incr_right_triangle(int n) {
        int count=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count++ + " ");
            }System.out.println();
        }
    }

    static void num_diamond(int n){
        for(int i=0; i<=2*n; i++){
            int total_cols= i>n?2*n-i:i;
            for(int j=n; j>total_cols; j--){
                System.out.print(" "); 
            }
            for(int j=total_cols; j>0; j--){
                System.out.print(j);
            }
            for(int j=2; j<=total_cols; j++){
                System.out.print(j);
            }
            System.out.println();
        } 
    }

    static void timewatch(int n){
        for(int i=0; i<=2*n; i++){
            int total_cols= i>n?2*n-i:i;
            for(int j=0; j<total_cols; j++){
                System.out.print(" "); 
            }
            for(int j=n; j>total_cols; j--){
                System.out.print("* ");
            }
            System.out.println();
        } 
    }

    static void triangle2(int n){       
        for(int i=0; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" "); 
            }
            for(int j=n; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        } 
    }

    static void triangle(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("* "); 
            }
            System.out.println();
        } 
    }

    static void right_triangle2(int n){
        for(int i=n; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print("* ");                
            }
            System.out.println();
            for(int j=i; j<=n; j++){
                System.out.print("  ");
            }
        }
    }

    static void right_triangle(int n){
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }System.out.println();
        }
    }

    static void obtuse(int n){
        star(n-1);
        star2(n);
    }

    static void star(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }System.out.println();
        }
    }

    static void starR(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            starR(r, c+1);
            System.out.print("* ");
        }else{
            starR(r-1, 0);
            System.out.println();
        }
    }

    static void star2(int n){
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }System.out.println();
        }
    }

    static void star2R(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            star2R(r, c+1);
        }else{
            System.out.println();
            star2R(r-1, 0);
        }
    }
}
