import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // System.out.print("Enter a number : ");
        // int a = input.nextInt();
        // if(a<=1){
        //     System.out.println("Enter a valid number");
        // }else if(a%2!=0){
        //     System.out.println(a + " is an odd number");
        // }else{
        //     System.out.println(a + " is an even number");
        // }

        // System.out.print("Enter your principal amount : ");
        // int p = input.nextInt();
        // System.out.print("Enter your Time period : ");
        // int t = input.nextInt();
        // System.out.print("Enter your rate : ");
        // int r = input.nextInt();

        // System.out.println("Your simple interest is "+ p*r*t);


        // int x = input.nextInt();
        // int y = input.nextInt();
        // int a = input.nextInt();
        
        // switch (a) {
        //     case 1: 
        //         System.out.println(x+y);
        //     break;

        //     case 2 : 
        //         System.out.println(x*y);
        //     break;

        //     default:
        //         System.out.println("enter valid input");
        //     break;
        // }

        // int a = input.nextInt();
        // int b = input.nextInt();
        // System.out.println(Math.max(a, b));

        // System.out.print("Enter a number : ");
        // int a= input.nextInt();
        // System.out.print(0 + " ");
        // System.out.print(1 + " ");
        // int x= 0;
        // int y = 1;

        // for(int i = 0 ; i<=a ; i++){
        //     int c = x+y;
        //     System.out.print(c + " ");
        //     x = y;
        //     y = c;
        // }

        // System.out.print("Enter a word : ");
        // String word = input.next();
        // String wordE = word.toLowerCase();
        // int a = wordE.length();
        // boolean chk = true;

        // for( int i = 0 ; i<wordE.length(); i++){
        //     if(wordE.charAt(i) == wordE.charAt(a-1)){
        //         a--;
        //         continue;
        //     }else{
        //         chk=false;
        //         break;
        //     }
        // }    
        // if(chk == true){
        //     System.out.println(word + " is a palindrome word");
        // }else{
        //     System.out.println(word + " is not a palindrome word");
        // }

        // System.out.print("Enter the number : ");
        // String pops = input.next().trim();
        // System.out.print("Which number : ");
        // char op = input.next().trim().charAt(0);
        // int count = 0;

        // for(int i = 0 ; i<pops.length() ; i++){
        //     if(pops.charAt(i) == op){
        //         count++;
        //     }continue;
        // }

        // System.out.println(op + " has occured " + count + " times");


        // System.out.print("Enter number : ");
        // int a = input.nextInt();
        // System.out.print("Which number : ");
        // int b = input.nextInt();

        // int count = 0 ;

        // while(a!= 0){
        //     int rem = a%10;
        //     if (rem == b){
        //         count++;
        //     }a = a/10;
        // }
        // System.out.println(b + " has occured " + count + " times");


        // System.out.print("Enter number : ");
        // int a = input.nextInt();
        // int total = 0, temp,rem,n=0;
        // temp = a;

        // while(temp!=0){
        //     n++;
        //     temp/=10;
        // }
        // temp=a;

        // while(temp!=0){
        //     rem = temp%10;
        //     total = total + (int)(Math.pow(rem,n ));
        //     temp = temp/10;
        // } 

        // if (total == a){
        //     System.out.println(a + " is a armstrong number");
        // }else{
        //     System.out.println(a + " is not a armstrong number");
        // }
        
        
        // System.out.print("Enter number : ");
        // int a = input.nextInt();
        // int x = 0;
        // int y = 1;
        // System.out.print(x + " ");
        // System.out.print(y + " ");

        // for (int i = 0 ; i<=a ; i++){
        //     int c = x+y;
        //     System.out.print(c + " ");
        //     x=y;
        //     y=c;
        // }


        // System.out.print("Enter a number : ");
        // int a = input.nextInt();
        // int rem,temp,add =0,pro = 1;
        // temp = a;

        // while(temp>0){
        //     rem = temp%10;
        //     add= add + rem;
        //     pro = pro * rem;
        //     temp/=10;
        // }
        // System.out.println(pro-add);


        // System.out.print("Enter a number : ");
        // int a = input.nextInt();

        // for(int  i = 1 ; i<=a; i++){
        //     if (a%i==0){
        //         System.out.print(i + " ");
        //     }
        // }

        // int total = 0;
        // while(true){
        //     System.out.print("Enter number : ");
        //     int a = input.nextInt();
        //     if(a!=0){
        //         total = a+total;
        //     }else{
        //         System.out.println("Sum is : " + total);
        //         break;
        //     }
        // }


        // int max = 0;
        // while(true){
        //     System.out.print("Enter number : ");
        //     int a = input.nextInt();
        //     if(a!=0){
        //         if(a>max){
        //             max= a;
        //         }
        //     }else{
        //         System.out.println("Largest number is : " + max);
        //         break;
        //     }
        // }


        // System.out.print("Enter number : ");
        // int a =  input.nextInt();
        // int tot = 1;

        // for (int i = 1  ; i<=a ; i++){
        //     tot = tot*i;
        // }
        // System.out.println("Factorial of "+a+ " is "+ tot);


        // int sum = 0;
        // int n =0;
        // while(true){
        //     System.out.print("Enter number : ");
        //     int a = input.nextInt();
        //     if (a!=0){
        //         sum = sum + a;
        //         n++;
        //     }else{
        //         System.out.println("Your average of numbers is : " + sum/n);
        //         break;
        //     }
        // }


        // System.out.print("Enter the price of the product : ");
        // int pr =  input.nextInt();
        // System.out.print("Enter the discount rate : ");
        // int dis = input.nextInt();

        // System.out.println("Your price after discount is : "+ (pr-(pr/dis)));
        // System.out.println("You got discount of : " + pr/dis);

        // System.out.print("Enter number : ");
        // int a = input.nextInt();

        // int sum = 0, temp, rem;
        // temp = a;
        // while(temp>0){
        //     rem = temp%10;
        //     sum = sum + rem;
        //     temp /=10;
        // }
        // System.out.println("your sum is "+ sum);


        // System.out.print("Enter your word : ");
        // String word = input.nextLine().trim().toLowerCase();
        // int cons = 0,vow = 0;

        // for(int i = 0 ; i<word.length() ; i++){
        //     char ch = word.charAt(i);
        //     if(ch == 'a'|| ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u'){
        //         vow++;
        //     }else{
        //         cons++;
        //     }
        // }
        // System.out.println("Yours number of vowels are : "+ vow);
        // System.out.println("Yours number of consonants are : "+ cons);


        // System.out.print("Enter your number : ");
        // int nu = input.nextInt();
        
        // int temp,rem,sum =0;
        // temp=nu;
        // while(temp>0){
        //     rem = temp%10;
        //     sum = sum*10 + rem;
        //     temp/=10;
        // }
        // if(sum == nu){
        //     System.out.println(nu +" number is palindrome");
        // }else{
        //     System.out.println(nu + " number is not palindrome");
        // }


        // System.out.print("Enter numbers : ");
        // int a = input.nextInt();
        // int b = input.nextInt();
        // int gcd =1;

        // for (int i = 1 ; i <= a && i<=b ; i++){
        //     if (a%i==0 && b%i==0){
        //         gcd = i;
        //     }
        // }
        // System.out.println("You lcm of " + a + " and " +b+" is " + a*b/gcd);


        // System.out.print("Enter numbers : ");
        // int a = input.nextInt();
        // int b = input.nextInt();
        // int lcm = (a>b)?a:b;

        // while(true){
        //     if (lcm%a==0 && lcm%b==0){
        //         System.out.println("Your lcm is : " +lcm );
        //         break;
        //     }
        //     lcm++;
        // }


        // System.out.print("Enter numbers : ");
        // int a = input.nextInt();
        // int b = input.nextInt();
        // int hcf = 1, cnt =Math.min(a, b);

        // while (cnt>0){
        //     if (a%cnt == 0 && b%cnt==0){
        //         hcf=cnt;
        //         break;
        //     }cnt--;
        // }System.out.println("Your hcf is : "+hcf);


        // System.out.print("Enter month number : ");
        // int a = input.nextInt();
        // int count=0;

        // switch (a){
        //     case 1,3,5,7,8,10,12 :
        //         int j = 31;
        //         for (int i = 1 ; i<=j ; i++){
        //             if(i%2==0){
        //                 count++;
        //             }
        //         }
        //     break;

        //     case 4,6,9,11 :
        //         int th = 30;
        //         for (int i = 1 ; i<=th ; i++){
        //             if(i%2==0){
        //                 count++;
        //             }
        //         }
        //     break;

        //     case 2 :
        //         int f = 29;
        //         for (int i = 1 ; i<=f ; i++){
        //             if(i%2==0){
        //                 count++;
        //             }
        //         }
        //     break;
        //     default : System.out.println("Enter valid month number");
        // }System.out.println(count);
        
    }
}