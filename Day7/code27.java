package Day7;

import java.util.Scanner;

public class code27 {
 public static long SumOfDigit(long n) {
    if(n==0){
        return 0;
    }
    return (n%10) + SumOfDigit(n/10);
 }   
 public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        long x=sc.nextLong();
        System.out.println("The Sum of Digits: "+ SumOfDigit(x));
 }
}
