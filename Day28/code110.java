package Day28;

import java.util.Scanner;

class Account{
    private String accountNo;
    private String customerName;
    private double balance;
    public Account(String accountNo,String customerName,double balance){
        this.accountNo=accountNo;
        this.customerName=customerName;
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit successfull");
        }
        else{
            System.out.println("The deposit amount should be greater zero");
        }
    }
    public void withdraw(double amount){
        if(amount>0){
            balance-=amount;
            System.out.println("Withdraw successfull");
        }
        else{
            System.out.println("The withdraw amount should be greater than 0");
        }
    }
    public double balanceEnquiry(){
        return balance;
    }
        public void displayAccountInfo() {
        System.out.println("\n--- Account Information ---");
        System.out.println("Holder Name: " + customerName);
        System.out.println("Account Number: " + accountNo);
        System.out.println("Balance: $" + balance);
    }
}
public class code110 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating a new account
        System.out.println("--- Welcome to Java Bank ---");
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accNo = scanner.nextLine();
        System.out.print("Enter initial deposit amount: ");
        double initialDeposit = scanner.nextDouble();
        System.out.println("Enter the login pin for your account");
        int loginPin=scanner.nextInt();
        Account account = new Account(name, accNo, initialDeposit);
        System.out.println("\nAccount created successfully!");
        System.out.println("enter your pin");
        int pin=scanner.nextInt();
        if(pin!=loginPin){
            System.out.println("Wrong pin");
            return;
        }

        // Menu loop
        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Account Info");
            System.out.println("5. Update Pin");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + account.balanceEnquiry());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmt = scanner.nextDouble();
                    account.deposit(depositAmt);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmt = scanner.nextDouble();
                    account.withdraw(withdrawAmt);
                    break;
                case 4:
                    account.displayAccountInfo();
                    break;
                case 5:
                     System.out.println("Enter new pin");
                     loginPin=scanner.nextInt();
                    System.out.println("Pin updated successfully");
                case 6:
                    exit = true;
                    System.out.println("Thank you for banking with Java Bank!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
