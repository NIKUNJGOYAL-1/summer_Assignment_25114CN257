package Day26;

import java.util.*;

public class code101 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=(int)(Math.random()*100)+1;
        System.out.println("--Welcome to the number guessing game--");
        System.out.println("I have chosen number between 1-100");
        System.out.println("You have 3 attempts");
        int userGuess;
        boolean win = false;
        for(int i=1;i<4;i++){
            System.out.println("The attempt number:"+i);
           userGuess=sc.nextInt();
            if(userGuess<1||userGuess>100){
                System.out.println("The number is out of bounds");
                i--;
                continue;
        }
            else if(userGuess==number){
                System.out.println("Congratulations you have correctly guess the number ");
                win=true;
                break;
        }
            else if(userGuess<number){
                System.out.println("The number is entered is lower , increase your guess");
                continue;
        }
            else if(userGuess>number){
                System.out.println("The number you entered is higher ,decrease your number");
                continue;
        }
            else {
                 System.out.println("input error");
                 break;
        }
        }
        if(!win){
            System.out.println("All attempts exhausted");
            System.out.println("The correct number was:"+number);
        }
        sc.close();
    }
}
