package Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        System.out.println(chkTs(nums));
    }

    static boolean chkTs(int[] num){
        int piv = pivot(num);
        boolean chkTs1 = first(num, piv,true);
        boolean chkTs2 = first(num, piv,false);
        return chkTs1==true && chkTs2==true? true:false;
    }

    static boolean first(int[] num, int piv, boolean tk){
        boolean chk=true;
        if(tk=true){
            for(int i=0; i<piv; i++){
                if(num[i]<num[i+1]){
                    chk=true;
                }else{
                    return false;
                }
            }return chk;
        }
        for(int i=piv+1; i<num.length-1; i++){
            if(num[i]<num[i+1]){
                chk=true;
            }else{
                return false;
            }
        }return chk;

    }

    // static boolean sec(int[] num, int piv){
    //     boolean chk=true;
    //     for(int i=piv+1; i<num.length-1; i++){
    //         if(num[i]<num[i+1]){
    //             chk=true;
    //         }else{
    //             return false;
    //         }
    //     }return chk;
    // }

    static int pivot(int[] num){
        int start = 0;
        int end = num.length-1;
        int mid;
        while(start<end){
            mid=start+(end-start)/2;
            if(mid<end && num[mid]>num[mid+1]){
                return mid;
            }else if(mid>start && num[mid]<num[mid-1]){
                return mid-1;
            }else if(num[mid]<=num[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return start;
    }
}
