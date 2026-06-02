package Day6;

import java.util.Scanner;

public class code24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter base number");
        long x=sc.nextLong();
        System.out.println("enter power number");
        long n=sc.nextLong();
        long result=1;
        for(long i=1;i<=n;i++){
            result=result*x;
        }
        System.out.println("The x^n:"+result);
        sc.close();
    }
    }
