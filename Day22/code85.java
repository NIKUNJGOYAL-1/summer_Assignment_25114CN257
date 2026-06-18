package Day22;

import java.util.Scanner;

public class code85 {
        static String reversed(String original){
        String reverse="";
        for(int i=original.length()-1;i>=0;i--){
          reverse+=original.charAt(i);
    }
    return reverse;
  }
  public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String text=sc.nextLine();
        boolean isPalindrome=false;
        String result=reversed(text);
        if(text.equalsIgnoreCase(result)){
            isPalindrome=true;
        }
        System.out.println("The string is palindrom:"+isPalindrome);
        sc.close();
  }
}
