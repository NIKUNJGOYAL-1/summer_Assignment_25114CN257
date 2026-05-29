package Day2;

import java.util.Scanner;

public class code7 {
 public static void main(String[] args) {
             Scanner sc= new Scanner(System.in);
        long n=sc.nextLong();
        long product=1;
        long digit;
        while(n!=0){
            digit=n%10;
            product=digit*product;
            n=n/10;
        }
        if(n==0){
            System.out.println(product);
        }
 }   
}
