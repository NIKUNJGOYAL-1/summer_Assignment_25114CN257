package Day4;

import java.util.Scanner;

public class code13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of fibonacci series term");
        long n=sc.nextLong();
        long a=0;
        long b=1;
        long c;
        System.out.println("the fibonacci series:");
        for (long i = 0; i <= n; i++) {
            System.out.println(a+" ");
                     long temp=b;
                     c=a+b;
                     b=c;   
                     a=temp;
            }
        System.out.println("end of the series");
        }
    }

