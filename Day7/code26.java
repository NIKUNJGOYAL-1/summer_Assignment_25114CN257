package Day7;

import java.util.Scanner;

public class code26 {
    public static long fibonacci (long n) {
        if(n<=0){
        return 0;
        }
        else if(n==1){
          return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        long x=sc.nextLong();
        System.out.println("The Fibonacci series :");
        for(long i=0;i<x;i++){
            System.out.println(fibonacci(i)+" ");
        }
    }
}
