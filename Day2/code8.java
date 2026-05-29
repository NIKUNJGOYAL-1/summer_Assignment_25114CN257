package Day2;
import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n=sc.nextLong();
        long reverse=0;
        long digit;
        long original=n;
        while(n!=0){
            digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        if(original==reverse){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
   }   
    }

