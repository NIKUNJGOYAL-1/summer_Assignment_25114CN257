package Day11;

import java.util.Scanner;

public class code43 {
    public static Boolean isPrime(int x){
        //loop to check if the number is prime
       for(int i=2;i<=x/2;i++){
        if(x%i==0){
            return false;
        }
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check");
        //input
        int n=sc.nextInt();
        //output
        System.out.println("The number is prime:"+isPrime(n));
    }
}
