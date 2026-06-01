package Day5;

import java.util.Scanner;

public class code20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        long n=sc.nextLong(); 
        long maxPrime=1;
        while(n%2==0){
            maxPrime=2;
            n/=2;
        }
        for(long i=3;i*i<=n;i+=2){
            while(n%i==0){
                maxPrime=i;
                n/=i;
            }
            }
            if(n>2){
                maxPrime=n;
            }
            System.out.println("the largest prime factor is "+n);
    }
}
