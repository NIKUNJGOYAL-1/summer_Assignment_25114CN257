package Day4;

import java.util.Scanner;

public class code14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("the starting number");
        long n1=sc.nextLong();
        System.out.println("the ending number");
        long n2=sc.nextLong();
        System.out.println("the prime numbers in the given range are-:");
        int temp;
        for(long i=n1;i<=n2;i++){
        if(i<=1){
            continue;
            }
            boolean isPrime=true;
            for(long j=2;j<i;j++){
            if(i%j==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println(i);
        }
        }
    }
}
