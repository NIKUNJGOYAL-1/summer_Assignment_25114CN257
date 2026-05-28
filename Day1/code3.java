package Day1;

import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int factorial=1;
    int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        factorial=factorial*i;
        }
        if (n < 0) {
    System.out.println("Factorial is not defined for negative numbers.");

    }    
        else if(n==0){
        System.out.println(1);
    } 
        else {
        System.out.println(factorial);
}
    }
}
