package Day29;

import java.util.Scanner;

public class code113 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        double num1=0,num2=0;
        do { 
        System.out.println("Welcome To The Calculator");
        System.out.println("1.Addittion");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");
        System.out.println("Enter your choice(1-5)");
            choice=sc.nextInt();
            if(choice>=1&&choice<=4){
                System.out.println("Enter first number");
                num1=sc.nextInt();
                System.out.println("Enter second number");
                num2=sc.nextInt();
            }
            switch(choice){
            case 1:
                System.out.println("Result:"+(num1+num2));
                break;
            case 2:
                System.out.println("Result:"+(num1-num2));
                break;
            case 3:
                System.out.println("Result:"+(num1*num2));
                break;
            case 4:
                if(num2==0){
                    System.out.println("Error:division by zero");
                    break;
                }
                System.out.println("Result:"+(num1/num2));
                break;
            case 5:
                System.out.println("Exit successfull");
                break;
            default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice!=5);
    }
}
