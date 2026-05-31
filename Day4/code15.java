package Day4;

import java.util.Scanner;

public class code15 {
public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number to check");
        long n=sc.nextLong();
        long count=1;
        long sum=0;
        long temp=n;
        for(long i=0;i<n;i++){
            temp=temp/10;
            if(temp!=0){
            count++;
            }       
         }
         temp=n;
        for(long j=0;j<n;j++){
            long digit=temp%10;
            sum+=Math.pow(digit,count);
            temp=temp/10;
        }
        if(n==sum){
            System.out.println(n +" is an armstrong number");
        }
        else{
            System.out.println(n +" is not an armstrong number");
        }
}     
}
