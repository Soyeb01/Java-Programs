package Arrays;

public class diagonal {
    public static void main(String[] args) {
        int[][] at = {{1,1,1,1},
              {1,1,1,1},
              {1,1,1,1},
              {1,1,1,1}};
        System.out.println(diagonalSum(at));
    }

    static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(i==j){
                    sum += mat[i][j];
                }else if(i+j==(mat.length-1) && i!=j){
                    sum += mat[i][j];
                }
            }
        }return sum;
    }
}
