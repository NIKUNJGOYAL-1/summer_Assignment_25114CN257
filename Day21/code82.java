package Day21;
import java.util.*;
public class code82 {
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
        System.out.println("The reverse of the string:"+reversed(text));
        sc.close();
  }
}