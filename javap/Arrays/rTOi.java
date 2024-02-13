package Arrays;

public class rTOi {
    public static void main(String[] args) {
        String roman = "MCMXCVI";
        int sum=0;
        for(int i=0; i<roman.length(); i++){
            if(roman.charAt(i)=='M'){
                sum+=1000;
            }else if(roman.charAt(i)=='D'){
                sum+=500;
            }else if(roman.charAt(i)=='L'){
                sum+=50;
            }else if(roman.charAt(i)=='V'){
                sum+=5;
            }
            else if(roman.charAt(i)=='C'){
                if(i+1<roman.length() && roman.charAt(i+1)=='M'){
                    sum+=900;
                    i++;
                }else if(i+1<roman.length() && roman.charAt(i+1)=='D'){
                    sum+=400;
                    i++;
                }else{
                    sum+=100;
                }
            }else if(roman.charAt(i)=='X'){
                if(i+1<roman.length() && roman.charAt(i+1)=='C'){
                    sum+=90;
                    i++;
                }else if(i+1<roman.length() && roman.charAt(i+1)=='L'){
                    sum+=40;
                    i++;
                }else{
                    sum+=10;
                }
            }else if(roman.charAt(i)=='I'){
                if(i+1<roman.length() && roman.charAt(i+1)=='X'){
                    sum+=9;
                    i++;
                }else if(i+1<roman.length() && roman.charAt(i+1)=='V'){
                    sum+=4;
                    i++;
                }else{
                    sum+=1;
                }
            }
        }System.out.println(sum);
    }
    
}
