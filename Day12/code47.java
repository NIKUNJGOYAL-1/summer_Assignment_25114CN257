package Day12;
import java.util.Scanner;
public class code47 {
    public static int Fibonacci(int n){
        //checks and throw error if negative number entered
        if(n<0){
            throw new IllegalArgumentException("negative input detected");
        }
        //checks if the number is less than 1 and is it is true returns the n
        if (n<=1){
            return n;
        }
        //recursive function
        else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();//input
        System.out.println("The "+n+"th fibonacci term:"+Fibonacci(n));//output
    }
}
