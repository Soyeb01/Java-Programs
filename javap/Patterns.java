public class Patterns {
    public static void main(String[] args) {

        /*
        // square
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        /*
        //right triangle
        int n = 5 ;
        for(int i=1; i<=n; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */


        /*
        //upside right triangle
        int n = 5;
        for (int i= 1; i<= n; i++){
            for (int j = i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */


        /*
        //rightside triangle
        int n = 5;
        for (int i= 1; i<= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();

            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
        }
        */

        /*
        //down rightside triangle
        int n = 5;
        for (int i= 1; i<= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        */

        /*
        //hill
        int n = 5;
        for (int i= 1; i<= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j < i; j++) {
                System.out.print(" *");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        */

        /*
        //downhill
        int n = 5;
        for (int i= 1; i<= n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print(" *");
            }

            for (int j = i; j < n; j++) {
                System.out.print(" *");
            }
            System.out.println();

            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
        }
        */

        /*
        //diamond
        int n = 5;
        for (int i= 1; i<= n; i++) {
            for (int j = i; j <n; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <=i; j++) {
                System.out.print(" *");
            }

            for (int j = 1; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i= 1; i< n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j <n; j++) {
                System.out.print(" *");
            }

            for (int j = i; j < (n-1); j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        */

        /*
        11  12  13  14  15
        21  22  23  24  25
        31  32  33  34  35
        41  42  43  44  45
        51  52  53  54  55
        */

        /*
        //hollow square
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        */

        /*
        //cross
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i==j || i+j == 6){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        */

        /*
        //timesand
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i==j || i==1 || i==5 || i+j == 6){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        */

        /*
        //butterfly
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i==j || i+j == 9 || j==1 || j==8 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        */

        /*
        //hollow hill
        int n = 5;
        for (int i= 1; i<= n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j < i; j++) {
                if(j==1 || i ==n){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }

            for (int j = 1; j <= i; j++) {
                if(i==n || j==i ){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        */

        /*
        //hollow downhill
        int n = 5;
        for (int i= 1; i<= n; i++) {
            for (int j = i; j <=n; j++) {
                if(i==1 || j == i ){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }

            for (int j = i; j < n; j++) {
                if(i==1 || j==(n-1)){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
        }
        */

        /*
        //hollow diamond
        int n = 5;
        for (int i= 1; i< n; i++) {
            for (int j = i; j<n; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <i; j++) {
                if(j==1){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }

            for (int j = 1; j <= i; j++) {
                if(j==i){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i= 1; i<= n; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j <n; j++) {
                if(j==i){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }

            for (int j = i; j <=n; j++) {
                if(j==n){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        */
    }
}