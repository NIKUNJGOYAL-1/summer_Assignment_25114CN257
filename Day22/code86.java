package Day22;

import java.util.Scanner;

public class code86 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String text=sc.nextLine();
        if(text.isEmpty()){
            System.out.println("The string is empty");
            return;
        }
        int wordcount=1;
            if(text.charAt(0)!=' '){
            for(int i=0;i<text.length();i++){
              if (text.charAt(i)==' '){
                wordcount+=1;
              }
            }
        }
        System.out.println("The wordcount:"+wordcount);
    }
}

