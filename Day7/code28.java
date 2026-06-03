package Day7;

import java.util.Scanner;

public class code28 {
    public static String Reverse(long n) {
        if(n<10){
            return Long.toString(n);
        }
        return (n%10)+Reverse(n/10);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        long x=sc.nextLong();
        System.out.println("The Reversed Number:"+Reverse(x));
    }
}