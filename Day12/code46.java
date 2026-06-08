package Day12;

import java.util.Scanner;

public class code46 {
    public static boolean isArmstrong(int x){
     int original =x;
     int sum=0;
     int count=0;
     //loop to find count
     while(x>0){
        count++;
        x/=10;
     }
     x=original;
     //loop to find sum of the digits raised to the power count
     while(x>0){
        int digit =x%10;
        sum=sum+(int)Math.pow(digit, count);
        x/=10;
     }
     //checks if the sum of the digits raised to the power count is equal to the number entered
     if(original==sum){
        return true;
     }
     return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check");
        int n=sc.nextInt();//input
        System.out.println("The number is armstrong number:"+isArmstrong(n));//output
    }
}
