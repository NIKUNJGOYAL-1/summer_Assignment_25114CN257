package Day26;

import java.util.Scanner;

public class code102 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        if(age<18){
            System.out.println("Not Eligible to vote");
        }
        else if(age<0){
            System.out.println("Wrong input");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
}
