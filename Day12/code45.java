package Day12;

import java.util.Scanner;

public class code45 {
     public static boolean isPalindrome(int x) {
        int reverse=0;
        int original =x;
        //loop to find reverse of the the number
        while(x>0){
            int digit=x%10;
            reverse=reverse*10+digit;
            x/=10;
        }
        //checks if the the reverse number is same as input number
        if(reverse==original){
            return true;
        }
        return false;
     }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check");
        int n=sc.nextInt();//input
        System.out.println("The number is palindrome:"+isPalindrome(n));//output
     }
}