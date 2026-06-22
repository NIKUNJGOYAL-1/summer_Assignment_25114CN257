package Day26;

import java.util.Scanner;

public class code103 {
    private static int pin=1234;
    private static double balance=1500.00;
    static double deposit(double balance,double amount){
        return balance+amount;
    }
    static double withdraw(double balance,double amount){
        return balance-amount;
    }
    static double balanceEnquiry(double balance){
        return balance;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double amount;
       int menuNo;
       do {
              System.out.println("Enter your pin to proceed");
              int userPin=sc.nextInt();
              if(userPin!=pin){
               System.out.println("Wrong pin entered");
               return;
           }
       System.out.println("----Menu----");
       System.out.println("1.Balance");
       System.out.println("2.Withdraw");
       System.out.println("3.Deposit");
       System.out.println("4.Exit");
       System.out.println("5.Pin change");
       System.out.println("--menu End--");
           menuNo=sc.nextInt();
           switch(menuNo){
               case 1:
                   System.out.println("Your account balance is:"+balanceEnquiry(balance));
            break;
            case 2:  
            System.out.println("Enter the amount to withdraw");
            amount =sc.nextDouble();
            withdraw(balance, amount);
            System.out.println("Withdraw successfull");
            System.out.println("Your updated balance is:"+balanceEnquiry(balance));
            break;
            case 3:
                System.out.println("Enter the amount to deposit");
                amount =sc.nextDouble();
                deposit(balance, amount);
                System.out.println("deposit successfull");
                System.out.println("Your updated balance is:"+balanceEnquiry(balance));
                break;
                case 4:
                    System.out.println("Thanks for transacting");
            System.out.println("Exit");
            break;
            case 5:
                System.out.println("enter new pin");
                pin=sc.nextInt();
                System.out.println("Pin updated successfull");
                break;
                default:
                    System.out.println("Wrong input");
                    break;
                }
                System.out.println();
            }while(menuNo!=4);
    }
}
