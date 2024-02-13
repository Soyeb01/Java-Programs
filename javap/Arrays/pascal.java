package Arrays;

import java.util.ArrayList;

public class pascal {
    public static void main(String[] args) {
        int numRows=7;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i=0; i<numRows; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    list.add(j,1);
                }else if(j>0){
                    int mel = ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    list.add(j,mel);
                }
            }ans.add(list);
        }
        for(int i=0; i<ans.size(); i++){
            for(int j=0; j<ans.get(i).size(); j++){
                System.out.println(ans.get(i).get(j));
            }
        }
    }
}
