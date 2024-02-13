package recurssion;

import java.util.Arrays;

public class basic {
    static int sum=0;
    public static void main(String[] args) {
        int num = 1020;
        System.out.println(count_zero_r(num,0));
    }

    static int count_zero_r(int num,int count) {
        if(num==0){
            return count;
        }
        if(num%10==0)
            count++;
        return count_zero_r(num/10, count);
    }

    static void rev_num(int x) {
        if(x==0){
            return;
        }
        int rem=x%10;
        sum= sum*10+rem;
        rev_num(x/10);
    }

    static boolean prime_R(int x, int i) {
        if(i*i>x){
            return true;
        }
        return x%i!=0 && prime_R(x, i+1);
    }

    static int product_R(int x, int y) {
        if(y>x){
            return product_R(y, x);
        }
        if(y==0){
            return 0;
        }
        return x+product_R(x, y-1);
    }

    static int sum_digit_R(int nums) {
        if(nums==0){
            return 0;
        }
        return nums%10+sum_digit_R(nums/10);
    }

    static char[] reverse_string(char[] s,char[] ans, int i){
        if(i==s.length){
            return ans;
        }
        ans[i]=s[s.length-1-i];
        reverse_string(s,ans,i+1);
        return ans;
    }

    static int max_num(int[] ko, int i) {        
        if(i==ko.length){
            return 0;
        }        
        int temp=max_num(ko, i+1);
        return ko[i]>temp?ko[i]:temp;
    }

    static void triangle_sum_aray(int[] ko) {
        if(ko.length==1){
            return;
        }
        int[] ans = new int[ko.length-1];
        helper(ans,ko,0);
        triangle_sum_aray(ans);
        System.out.println(Arrays.toString(ans));
    }

    static int[] helper(int[] ans, int[] ko, int i) {
        if(i==ans.length){
            return ans;
        }
        ans[i]=ko[i]+ko[i+1]; 
        return helper(ans, ko, i+1);
    }

    static void uppercase_letter(String string, int i, int chk) {
        if(i==string.length() && chk==0){
            System.out.println("none");
            return;
        }else if(i==string.length()){
            return;
        }else if(string.charAt(i)<='Z'){
            System.out.println(string.charAt(i));
            uppercase_letter(string, i+1,chk+1);
        }else{
            uppercase_letter(string, i+1,chk);
        }
        
    }

    static void first_uppercase_letter(String ng, int start) {
        if(start==ng.length()){
            System.out.print("none");
            return;
        }
        else if(ng.charAt(start)<='Z'){
            System.out.print(ng.charAt(start));
            return;
        }else{
            first_uppercase_letter(ng, start+1);
        }

    }

    static void oneton(int n) {
        if(n==0){
            return;
        }
        oneton(n-1);
        System.out.print(n+" ");
    }

    static void nto1(int n) {
        if(n==0){
            return;
        }System.out.print(n+" ");
        nto1(n-1);
    }
}
