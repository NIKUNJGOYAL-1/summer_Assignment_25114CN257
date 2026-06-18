package Day21;

import java.util.Scanner;

public class code84 {
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String text=sc.nextLine();
        sc.close();
        String result=text.toUpperCase();
        System.out.println("The updated string:"+result);
      }
}
