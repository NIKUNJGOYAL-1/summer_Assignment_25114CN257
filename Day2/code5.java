package Day2;

import java.util.Scanner;

public class code5{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n=sc.nextLong();
        long sum=0;
        long temp;
        while(n!=0){
            temp=n%10;
            n=n/10;
            sum=sum+temp;
        }
        if(n==0){
            System.out.println(sum);
        }
    }
}