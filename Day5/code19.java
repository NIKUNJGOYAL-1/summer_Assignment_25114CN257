package Day5;

import java.util.Scanner;

public class code19 {
 public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to find factors of it");
        long n=sc.nextLong();  
        System.out.println("The factor of "+n+" are");
        for(long i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }

 }   
}
