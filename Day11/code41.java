package Day11;

import java.util.Scanner;

public class code41 {
    public static int Sum(int x,int y){
    return x+y;//return the sum of the numbers
    }
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter first number");//first input
        int a=num.nextInt();
        System.out.println("enter second number");//second input
        int b=num.nextInt();
        System.out.println("The sum is:"+Sum(a, b));//output
    }
}
