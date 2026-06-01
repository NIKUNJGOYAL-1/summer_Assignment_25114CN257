package Day5;

import java.util.Scanner;

public class code17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to check");
        long n=sc.nextLong();
        long sum=0;
        if(n<=0){
            System.out.println(n+" is not a perfect number");
            return;
        }
        for(long i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if (sum==n) {
            System.out.println(n+" is a perfect number");
        }
        else{
            System.out.println(n+" is not a perfect number");
        }
        
    }
}
