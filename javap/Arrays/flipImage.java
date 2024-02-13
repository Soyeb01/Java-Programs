package Arrays;

import java.util.Arrays;

public class flipImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipAndInvertImage(image);
        for(int i=0; i<image.length; i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                image[i][j]= image[i][(image[i].length-1)-j] == 0? 1:0;
                System.out.println(image[i][j]);
            }
        }
        return image;
    }
}
//     static int[][] horizontal(int[][] pic){
//         int[][] temp= new int[pic.length][pic]; 
//         for(int i=0; i<pic.length; i++){
//             for(int j=0; j<pic[i].length; j++){
//                 temp[i][j]= pic[i][pic[i].length-j];
//             }
//         }
//         return temp;
//     }

//     static int[][] invert(int[][] arr){
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[i].length; j++){
//                 if(arr[i][j]==0){
//                     arr[i][j]=1;
//                 }else{
//                     arr[i][j]=0;
//                 }
//             }
//         }
//         return arr;
//     }
// }
