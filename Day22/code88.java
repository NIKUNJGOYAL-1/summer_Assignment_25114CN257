package Day22;

import java.util.Scanner;

public class code88 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String text=sc.nextLine();
        char[] updated=new char[text.length()];
        int count=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                continue;
            }
            else{
                updated[count]=text.charAt(i);
                count++;
            }
        }
             String result = new String(updated,0,count);
             System.out.println("the string without spaces:"+result);
    }
}
