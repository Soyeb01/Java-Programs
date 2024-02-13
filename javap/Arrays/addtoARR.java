package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class addtoARR {
    public static void main(String[] args) {
        int[] nums = {9,9,9,9};
        int k=999999, curr=k, n=nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int i=n;
        while(--i>=0 || curr>0){
            if(i>=0){
                curr+=nums[i];
            }ans.add(curr%10);
            curr/=10;
        }
        Collections.reverse(ans);
        for(int j=0; j<ans.size(); j++){
            System.out.println(ans.get(j));
        }
    }
}
