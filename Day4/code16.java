package Day4;

import java.util.Scanner;

public class code16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("the starting number");
        long n1=sc.nextLong();
        System.out.println("the ending number");
        long n2=sc.nextLong();
        System.out.println("the armstrong numbers in this interval is:");
        for(long k=n1;k<=n2;k++){ 
            long count=1;
            long sum=0;
            long temp=k;
            for(long i=0;i<k;i++){
                temp=temp/10;
                if(temp!=0){
                    count++;
                }       
            }
            temp=k;
            for(long j=0;j<k;j++){
                long digit=temp%10;
                sum+=Math.pow(digit,count);
                temp=temp/10;
            }
            if(k==sum){
                System.out.println(k);
            }
        }
    }
}
