package Arrays;

public class charLar {
    public static void main(String[] args) {
        char[] letters = {'c','d','p','r','s','t'};
        char target = 'f';
        System.out.println(res(letters, target));
    }

    static char res(char[] letters, char target){
        if(letters[letters.length-1]<target){
            return letters[0];
        }
        int start =0;
        int end = letters.length -1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(mid<end && letters[mid]<target && letters[mid+1]>target){
                return letters[mid+1];
            }else if(mid>start && letters[mid]>target && letters[mid-1]<target){
                return letters[mid];
            }if(letters[mid]>target){
                end= mid-1;
            }else if(letters[mid]<target){
                start =mid+1;
            }else{
                return letters[mid+1];
            }
        }return 'o';
    }
}
