package Day2;

import java.util.Scanner;

public class code6 {
   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n=sc.nextLong();
        long reverse=0;
        long digit;
        while(n!=0){
            digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        if(n==0){
            System.out.println(reverse);
        }
   }    
}
