package Day11;
import java.util.Scanner;

public class code44 {
 public static int factorial(int x) {
    //recursive function to calculate the factorial of the number entered by user
     if(x==0){
        return 1;
     }
     else{
        //recursive statement,calls the factorial function again and again until x aproaches to 0
        return x*factorial(x-1);
     }
 }   
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        //input
        int n=sc.nextInt();
        //output
        System.out.println("The factorial is:"+factorial(n));
 }
}
