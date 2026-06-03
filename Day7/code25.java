package Day7;

import java.util.Scanner;

public class code25 {
    public static long factorial (long n) {
     if(n==0 || n==1) {
        return 1;
     }
     return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        long x=sc.nextLong();
        System.out.println(factorial(x));
    }
}
