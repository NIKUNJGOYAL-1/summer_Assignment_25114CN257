package Day21;

import java.util.Scanner;

public class code81 {
    static int lengthOfString(String text){
        int length=0;
        for(char c:text.toCharArray()){
            length ++;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String text=sc.nextLine();
        System.out.println("The length of the string:"+lengthOfString(text));
        sc.close();
    }
}
