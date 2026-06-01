package Day5;
import java.util.Scanner;

public class code18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to check");
        long n=sc.nextLong();  
        long digit;
        long sum=0;
        long original=n;
        if(n==0){
            System.out.println(n+" is not strong number");
            return;
        }
        while(n>0){
            digit=n%10;
            n=n/10;
            long fact=1;
            for(long i=digit;i>0;i--){
                fact=fact*i;
            }
            sum=sum+fact;
        }
        if(sum==original){
            System.out.println(original+" is the strong number");
        }
        else{
            System.out.println(original+" is not strong number");
        }
    }
}
