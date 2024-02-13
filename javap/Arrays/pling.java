package Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class pling {
    public static void main(String[] args) {
        String[] words = {"a","abc","aba",""};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(i!=j){
                    boolean chkO = checkPal(words[i], words[j]);
                    if(chkO==true){
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(i);
                        list.add(j);
                        ans.add(list);
                    }
                }
            }
        }System.out.println(ans);
    }

    static boolean checkPal(String a, String b){
        String tel = a.concat(b);
        boolean chk = false;
        for(int i=0; i<tel.length(); i++){
            if(tel.charAt(i)==tel.charAt((tel.length()-1)-i)){
                chk=true;
            }else{
                return false;
            }
        }return chk;
    }
}
