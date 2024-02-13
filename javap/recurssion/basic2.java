package recurssion;

public class basic2 {
    public static void main(String[] args) {
        int[] arr = {1,20,29,12};
        int target=12;
        System.out.println(find_ele_r(arr,target,0));
    }

    static int find_ele_r(int[] arr, int target, int i) {
        if(i==arr.length){
            return 0;
        }return arr[i]==target?i:find_ele_r(arr, target, i+1);
    }

    static boolean is_sort_r(int[] arr,int i) {
        if(i>=arr.length-1){
            return true;
        }return arr[i]<=arr[i+1] && is_sort_r(arr, i+1);
    }
}
